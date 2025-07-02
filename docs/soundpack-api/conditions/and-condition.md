## And Condition
Checks if all conditions are true.

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Conditions | Condition[] | N/A |

### Usage
```json
{
    "type": "and",
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