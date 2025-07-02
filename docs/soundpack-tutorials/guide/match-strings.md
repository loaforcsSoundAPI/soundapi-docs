## SoundAPI method

The SoundAPI method is simple and gives you more information, however it can be more difficult to find certain Match Strings as they only appear when the corresponding sound plays ingame.

### Instructions:

- **Step 1:** Find and open SoundAPI's config file (`me.loaforc.soundapi.cfg`) inside BepInEx' `config` folder 
  - Alternatively do this in the config section of your chosen mod manager
- **Step 2:** Enable/set to "true" `MatchStrings` and `GenerateReports`
- **Step 3:** Run the game and play until you hear the sound(s) you wish to replace play once
  - This part can likely be sped up with the help of other mods
- **Step 4:** When you hear the sound you want to replace, check BepInEx' console for Match String Debug entries made by SoundAPI. These entries will appear the moment you hear the sound. Common sense is usually enough to figure out which entry refers to which sound.
  - If you cannot see any Debug entries, check BepInEx' config file and enable Debug logging
- **Step 5:** Find and open folder named "loaforc-loaforcsSoundAPI" inside BepInEx' `plugins` folder
- **Step 6:** Open folder named "loaforcsSoundAPI", then open folder named "reports"
- **Step 7:** Open most recently generated report(s)

Within these report files is information on any sounds that played when you had the game open, among other things such as available conditions.

Right now, all you need to do is find the Match String of the sound you wish to replace (See Step 4 or Decompiling method to find out which one it is). <br/>
The match string will likely look similar to this `Enemy:EnemySounds:EnemyAttackPlayer`

> [!IMPORTANT]
> SoundAPI uses up to three sections (`GameObject:AudioSource:SoundFile`) of specification for when a sound should be replaced, but if a Sound File is used in multiple places you may want to include an `AudioSource` and/or `GameObject` to specify when exactly it should be used.

Once you've found your Match String, copy it into the Match String section. <br/>
Then take *your replacement* Sound File and copy its name *and* format into the Sound File section.

Your `examplereplacer.json` should now look something like this

```json5
{
	"replacements": [
		{
			"matches": "*:EnemyAttackPlayer",
			"sounds": [
				{
					"sound": "MyAttackSound.wav"
				}
			]
		}
	]
}
```

> [!TIP]
> Make sure to put a \* in the place of the `AudioSource` if you do not know what it is or don't want to use it 

## Decompiling method

Decompiling gives you access to all available sounds. <br/> 
This makes it easy to find the sound you want to replace, but leaves out some technical information

### Instructions:

> [!CAUTION]
> This section will only cover decompiling Unity games using [AssetRipper](https://github.com/AssetRipper/AssetRipper/releases)
> 
> Developers may also prohibit/frown upon the decompiling of their game - especially if you *share* any decompiled files - so do this at your own risk

First, open up AssetRipper and on the top toolbar go to File > Open Folder, and select "%GAMENAME%_Data", which you can find in the directory where the game is installed. <br/>
(if you don't know where your game is installed, just go to Steam, right click on the game in your library, and then go to Manage > Browse Local Files)

Now, to extract ALL the audio files from the game, you need to find and open a folder named AudioClip. <br/>
Once you've found a file within an AudioClip folder, select it and at the top click on Export > Export All Files of Selected Type. <br/>
Afterwards, select where you would like to save the audio files and click Select Folder. 

Now go to the directory you exported the audio files to, then go to %GAMENAME%\ExportedProject\Assets\AudioClip, and there you should be able to see all the audio files that are currently in the game! <br/>
Feel free to copy these files somewhere else or to delete the .meta files.

> Originally written by FutureSavior

You can now browse through these files to find the sound you want to replace, *but to speed up the process you may want to use the SoundAPI method*

> [!IMPORTANT]
> SoundAPI uses up to three sections (`GameObject:AudioSource:SoundFile`) of specification for when a sound should be replaced, but this method will only give you one of them; the `SoundFile`.

Once you've found the sound you want to replace, copy its name into the Match String section. <br/>
Then take *your replacement* Sound File and copy its name *and* format into the Sound File section.

Your `examplereplacer.json` should now look something like this

```json5
{
	"replacements": [
		{
			"matches": "*:EnemyAttackPlayer",
			"sounds": [
				{
					"sound": "MyAttackSound.wav"
				}
			]
		}
	]
}
```

> [!CAUTION]
> As you do not know the `GameObject` or `AudioSource`, you _have_ to put \*: right before the name of the original Sound File

## Mappings
[Mappings](/soundpack-api/mappings) are a more future-proof way to write match strings. Sometimes with game or mod updates match strings will change as things are renamed. 
If a mod developer provides mappings, they can update the mapping themself, ensuring that any soundpack made using with those mappings are kept working.

Mappings look similar to match strings, except for the fact they start with a `#`.

### Example
Some FacilityMeltdown music replacements use `MeltdownHandler:MeltdownMusic:meltdownMusic` as the match string. This is the correct match string *for now*, it could change at any point (in fact it already has in the past!).

So to get around the possibility of our music replacement breaking, `FacilityMeltdown` itself provides mappings to SoundAPI.
It provides the `FacilityMeltdown:music` mapping, which we can use instead. 

When SoundAPI loads it will replace `#FacilityMeltdown:music` with the correct match string: `MeltdownHandler:MeltdownMusic:meltdownMusic`.

This is great becuase now when FacilityMeltdown updates, it can update what it tells SoundAPI to replace `#FacilityMeltdown:music` with!

Example json using the FacilityMeltdown mapping:
```json
{
    "replacements": [
        {
            "matches": "#FacilityMeltdown:music",
            "sounds": [
                {
                    "sound": "meltdown.ogg"
                }
            ]
        }
    ]
}
```