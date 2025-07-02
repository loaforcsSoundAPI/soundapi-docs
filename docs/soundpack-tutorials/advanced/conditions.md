`Condition`s are the glue of SoundAPI, what makes it powerful and easily adaptable. <br/>
With them you can further specify when sounds should and shouldn't be replaced.

When looking to replace a sound, SoundAPI will check the `Condition`s, if they all are `true` then the sound is a valid replacement.

`Condition`s can be placed in 3 specific positions within a replacer. You can only have one `Condition` in one of these positions.

However logic gate conditions (and, nand, or, nor) have `Condition`s as properties, so by using logic gate conditions you can mix together multiple `Condition`s.

<details open>

<summary>(Click for Example)</summary>

```json5
{
	// This condition governs everything within the replacer
	// If FALSE this file will be skipped
	"condition": {
	},
	"replacements": [
		{
			"matches": "*:ZombieAttackPlayer",
			// this condition governs any sounds within this specific matcher
			// If false the matched sounds will not be replaced
			"condition": {
			},
			"sounds": [
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSound.ogg",
					// This condition governs this sound specifically
					// If false this specific Sound File will not be used
                    //
					// If no other Sound Files are available 
                    // the matcher is effectively disabled
					"condition": {
					}
				}
			]
		}
	]
}
```

</details>