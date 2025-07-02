## Nand Condition
Checks if all conditions are false.

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Conditions | Condition[] | N/A |

### Usage
```json
{
    "type": "nand",
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
