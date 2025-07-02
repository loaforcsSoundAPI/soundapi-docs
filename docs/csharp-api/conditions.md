SoundAPI allows easy definition of new conditions that Sound-pack creators can use. Note that you should follow SoundAPI's [Naming Convention](/soundpack-tutorials/naming-convention)

```cs
[SoundAPICondition("LethalCompany:apparatus_state")] // attribute for SoundAPI.RegisterAll function
public class ApparatusStateCondition : Condition {
    public enum StateType {
    	PULLED,
    	PLUGGED_IN
    }
    internal static bool CurrentApparatusPulled = false;

    public StateType? Value { get; private set; }

    public override bool Evaluate(IContext context) {
    	StateType state = CurrentApparatusPulled ? StateType.PULLED : StateType.PLUGGED_IN;
		
    	return state == (Value ?? StateType.PULLED);
    }
}

// To register all in your assembly (this will respect other soft-dependencies in your mod)
SoundAPI.RegisterAll(Assembly.GetExecutingAssembly());

// Or manually (if you need more complex logic)
SoundAPI.RegisterCondition("LethalLevelLoader:dungeon:has_tag", () => new LLLTagCondition<ExtendedDungeonFlow>(() => {
    if (!RoundManager.Instance) return null;
    if (!RoundManager.Instance.dungeonGenerator) return null;
    if (!PatchedContent.TryGetExtendedContent(
        RoundManager.Instance.dungeonGenerator.Generator.DungeonFlow, 
        out ExtendedDungeonFlow lllDungeon)
    ) return null;
    return lllDungeon;
}));
```

Because `Value` is `nullable`, the sound pack creator does not need to supply a `value`, and it will default to `PULLED`. Otherwise, they can manually set it to `PLUGGED_IN` to check if the apparatus is plugged in.
It's recommended to use an enum even if there are currently only two options for forward compatibility.