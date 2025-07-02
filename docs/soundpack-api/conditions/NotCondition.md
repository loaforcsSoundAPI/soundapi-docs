## Not Condition
Inverts the result of a condition.
`true` -> `false`
`false` -> `true`

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Condition | Condition | N/A |

### Usage
```json
{
    "type": "not",
    "condition": {
        "type": "mod_installed",
        "config": "me.loaforc.facilitymeltdown"
    }
}
```
