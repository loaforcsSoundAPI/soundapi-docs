## Nor Condition
Checks if any conditions are true.

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Conditions | Condition[] | N/A |

### Usage
```json
{
    "type": "nor",
    "conditions": [
        {
            "type": "config",
            "config": "Compatibility:replace_meltdown_music"
        },
        {
            "type": "mod_installed",
            "value": "me.loaforc.facilitymeltdown"
        }
    ]
}
```
