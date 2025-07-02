## Basics
Go ahead and open the `examplereplacer.json` file you created before, and copy the following into it.

```json5
{
	"replacements": [
		{
			"matches": "<Match String Here>",
			"sounds": [
				{
					"sound": "<Sound File Name Here>"
				}
			]
		}
	]
}
```

> [!TIP]
> If using Notepad ++ pressing TAB allows for quicker creation of this ladder style formatting 

Right now there are two elements missing from our replacer; the ***Match String*** and a ***Sound File***. 

**A Sound File** can be found on the internet or made using the various programs listed at the beginning of this page, but it ***must*** be in `wav`, `ogg`, or `mp3` format. <br/>
`wav` is an uncompressed file format and trades file size for higher quality audio. If you want to make sure your mod is quick to install, use files in `ogg` or `mp3` format. <br/>
Files can easily be converted to other formats using an audio editor like [Audacity](https://www.audacityteam.org/) or websites like [CloudConvert](https://cloudconvert.com/). <br/>
Be sure to place Sound Files in the `sounds` folder you previously created!


[A Match String](/soundpack-api/guide/match-strings) can be found using SoundAPI itself or by decompiling the game, but doing both is recommended!

# Multiple Matches and Sounds

Within a replacer you can bind multiple Match Strings to multiple Sound Files, which can be done as such.
<details open>

<summary>(Click for Example)</summary>

```json5
{
	"replacements": [
		{
			"matches": [
			"*:EnemyAttackPlayerVariation1",
			"*:EnemyAttackPlayerVariation2",
			],
			"sounds": [
				{
					"sound": "MyAttackSoundVariation1.mp3",
					"weight": 1
				},
				{
					"sound": "MyAttackSoundVariation2.mp3",
					"weight": 1
				}
			]
		}
	]
}
```

</details>

> [!TIP]
> Make sure to always include a weight value when binding multiple sounds to a matcher. By increasing the weight value, you can make a sound more likely to play.
> 
> e.g. two sounds, one with a weight of 1 and the other with a weight of 99, will mean the former has a 1% chance to play and the latter has a 99% chance to play.

You can also include as many matchers as you want.

<details>

<summary>(Click for Example)</summary>

```json5
{
	"replacements": [
		{
			"matches": [
			"*:EnemyAttackPlayerVariation1",
			"*:EnemyAttackPlayerVariation2",
			],
			"sounds": [
				{
					"sound": "MyAttackSoundVariation1.mp3",
					"weight": 1
				},
				{
					"sound": "MyAttackSoundVariation2.mp3",
					"weight": 1
				}
			]
		},
		{
			"matches": [
			"*:EnemyKilledByPlayerVariation1",
			"*:EnemyKilledByPlayerVariation2",
			],
			"sounds": [
				{
					"sound": "MyKillEnemySoundVariation1.mp3",
					"weight": 1
				},
				{
					"sound": "MyKillEnemySoundVariation2.mp3",
					"weight": 1
				}
			]
		}
	]
}
```
</details>

## Organizing Replacers

`Replacer.json` files can be put into folders, and you can organize them by renaming the `Replacer.json` file itself. <br/>
For example:
```
    replacers/
     ├── Player.json
     ├── Music.json
     ├── Enemies/
     │    ├── Spider.json
     │    ├── Zombie.json
```

## Organizing Sounds

Sound files can be organized using folders. You can nest as many folders as you want within each other.


```
   sounds/
    ├── Soundtrack1.ogg
    ├── Soundtrack2.ogg
    ├── Soundtrack3.ogg
    ├── Enemies/
    │    ├── Spider/
    │    │     ├── MyAttackPlayerSound.ogg
    │    │     └── MyKilledByPlayerSound.ogg
    │    └── Zombie/
    │          ├── MyAttackPlayerSound.ogg
    │          └── MyKilledByPlayerSound.ogg
    ├── Player/
    │    ├── MyPlayerFootstepSound1.ogg
    │    ├── MyPlayerFootstepSound2.ogg
    │    ├── MyPlayerFootstepSound3.ogg
    │    ├── MyPlayerFootstepSound4.ogg
    │    ├── Weapons/
    │    │     ├── MyCrowbarPickUpSound.ogg
    │    │     ├── MyCrowbarSwingSound.ogg
    │    │     └── MyCrowbarHitSound.ogg
    │    └── UI/
    │          ├── MyTakeDamageSound.ogg
    │          └── MyKillEnemyNotificationSound.ogg
    └── ...  
```

> [!CAUTION]
> Organizing using folders *must* be represented within the respective `Replacer.json` files!

<details>

<summary>(Click for Example)</summary>

```json5
{
	"replacements": [
		{
			"matches": "*:ZombieAttackPlayer",
			"sounds": [
				{
					"sound": "Enemies/Zombie/MyAttackPlayerSound.ogg"
				}
			]
		},
		{
			"matches": "*:SpiderAttackPlayer",
			"sounds": [
				{
					"sound": "Enemies/Spider/MyAttackPlayerSound.ogg"
				}
			]
		},
		{
			"matches": "*:SwingCrowbar",
			"sounds": [
				{
					"sound": "Player/Weapons/MyCrowbarSwingSound.ogg"
				}
			]
		}
	]
}
```

</details>

# Comments

In large projects - especially if working with other people - leaving comments can be very useful for quickly understanding what does what and how later in development.

Comments can be created simply by adding `//` to the beginning of the comment.<br/>
Try to avoid using special characters (such as `@#{&%=` ), as they can cause errors if not properly added!

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
					"sound": "Enemies/Zombie/MyAttackPlayerSound.ogg"
				}
			]
		},
		{
			// This checks for when the Spider enemy attacks the Player
			"matches": "*:SpiderAttackPlayer",
			"sounds": [
				{
					"sound": "Enemies/Spider/MyAttackPlayerSound.ogg"
				}
			]
		},
		{
			// This checks for when the Player swings the Crowbar weapon
			"matches": "*:SwingCrowbar",
			"sounds": [
				{
					"sound": "Player/Weapons/MyCrowbarSwingSound.ogg"
				}
			]
		}
	]
}
```

</details>

This is all the basic knowledge you need to use SoundAPI! <br/>
If you only want to change a few sounds, you can probably stop reading the guide here.