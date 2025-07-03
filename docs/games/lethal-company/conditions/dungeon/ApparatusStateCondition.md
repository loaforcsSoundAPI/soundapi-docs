## Apparatus State Condition
Checks the status of the current apparatus, resets when leaving a moon.

### StateType
- `plugged_in`: When apparatus has not been pulled, or there is no apparatus
- `pulled`: When apparatus has been pulled

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Value | [StateType](#statetype) | `pulled` |

### Usage
```json
{
    "type": "LethalCompany:apparatus_state",
    "value": "plugged_in"
}
```
