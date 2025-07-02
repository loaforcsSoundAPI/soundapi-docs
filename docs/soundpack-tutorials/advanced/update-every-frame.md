`update_every_frame` will re-validate all [Conditions](/soundpack-tutorials/advanced/conditions) within a replacer every frame.
This can be used to change sound whilst they are still playing, and is particularly useful with looping sounds/sounds that don't stop playing.

> [!NOTE]
> This example uses Lethal Company conditions

> [!CAUTION]
> `update_every_frame` is currently only semi-functional, and will be fixed in `v2.1`

## Example
```json5
{
    "update_every_frame": true,
	"replacements": [
		{
			"matches": "*:PlayerTakeDamage",
			"sounds": [
				{
					"sound": "PlayerLowHealthWarning.wav",
					"condition": {
						"type": "LethalCompany:player:health",
						"value": "..50",
					},
					// This sound will play if the player's health is above 
					"weight": 1
				},
				{
					"sound": "PlayerCriticalHealthWarning.wav",
					"condition": {
						"type": "LethalCompany:player:health",
						"value": "..50",
					},
					"weight": 1
				}
			]
		}
	]
}
```