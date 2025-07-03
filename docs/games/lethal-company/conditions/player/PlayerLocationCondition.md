## Player Location Condition
Checks the current player's approximate location.

### LocationType
- `inside`: Inside the dungeon
- `on_ship`: On/Around the ship (requirements to be teleported on takeoff)
- `outside`: Not inside the dungeon and not on the ship.

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Value | [LocationType](#locationtype) | N/A |

### Usage
```json
{
    "type": "LethalCompany:player:location",
    "value": "inside"
}
```
