## Ship State Condition
Checks the current state of the ship.
If you want to check the specific moon the ship has landed on use the [Moon Name Condition](/games/lethal-company/conditions/MoonNameCondition).

### ShipStateType
- `in_orbit`: In orbit
- `landed`: Landed on a moon

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Value | [ShipStateType](#shipstatetype) | N/A |

### Usage
```json
{
    "type": "LethalCompany:ship:state",
    "value": "in_orbit"
}
```
