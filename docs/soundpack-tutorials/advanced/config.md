# Config

SoundAPI can generate config files that allow the end user to choose which sounds are replaced. <br/>
To do this, you need to add the following to a `Condition` ([Learn more about conditions](/soundpack-tutorials/advanced/conditions)). <br/>
The condition will activate if `true` unless otherwise specified!

<details open>

<summary>(Click for Example)</summary>

```json5
{
	"condition": {
        "type": "config",
        "config": "Category:Option",
	},
	"replacements": [
		{
			"matches": "*:ZombieAttackPlayer",
			"sounds": [
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSound.ogg"
				}
			]
		}
	]
}
```

</details>

We also need to modify `sound_pack.json` and add further information about what this config does

<details open>

<summary>(Click for Example)</summary>

```json5
{
    "name": "MySoundMod",
    "config": {
        "Category:Option": {
            "description": "Enable Zombie attack sound?",
            "default": true
        }
    }
}
```

</details>

You can modify the `Category` and `Option` lines freely, but as before, try to organize them!

<details>

<summary>(Click for Example)</summary>

```json5
{
    "name": "MySoundMod",
    "config": {
        "Enemies:ZombieAttackSounds": {
            "description": "Enable Zombie attack sound?",
            "default": true
        }
    }
}
```

</details>

Configs can also be used to switch between alternative sounds. <br/>
To do this, we need to use the `Value` property. If the config is the same as whatever you wrote in `Value`, the `Condition` will be activated.

Make sure to include available variation names in the description!

<details>

<summary>(Click for Example)</summary>

```json5
{
    "name": "MySoundMod",
    "config": {
        "Enemies:ZombieAttackSound": {
            "description": "Enable Zombie attack sound? (Type1 / Type 2)",
            "default": "Type1"
        }
    }
}
```
```json5
{
	"replacements": [
		{
			// This checks for when the Zombie enemy attacks the Player 
			"matches": "*:ZombieAttackPlayer",
			"sounds": [
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSoundType1.mp3",
					"condition": {
                        "type": "config",
                        "config": "Enemies:ZombieAttackSound",
                        "value": "Type1"
					},
					"weight": 1
				},
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSoundType2.mp3",
					"condition": {
                        "type": "config",
                        "config": "Enemies:ZombieAttackSound",
                        "value": "Type2"
					},
					"weight": 1
				},
			]
		}
	]
}
```

</details>

You can also use `true` or `false` here. 

<details>

<summary>(Click for Example)</summary>

```json5
{
	"replacements": [
		{
			// This checks for when the Zombie enemy attacks the Player 
			"matches": "*:ZombieAttackPlayer",
			"sounds": [
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSoundType1.mp3",
					"condition": {
					"type": "config",
					"config": "Enemies:ZombieAttackSound",
					"value": true
					},
					"weight": 1
				},
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSoundType2.mp3",
					"condition": {
					"type": "config",
					"config": "Enemies:ZombieAttackSound",
					"value": false
					},
					"weight": 1
				},
			]
		}
	]
}
```

</details>