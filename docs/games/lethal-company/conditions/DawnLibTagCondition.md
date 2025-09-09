## Dawn Lib Tag Condition
Checks if the current moon/dungeon has a specific tag. Requires [DawnLib](https://thunderstore.io/c/lethal-company/p/TeamXiaolan/DawnLib/). 

You can view all tags by enabling `TagInfoExport` under `Exports` in the DawnLib config.

> [!WARNING]
> Unlike other conditions, `value` is **case-sensitive**.

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Value | String | N/A |

### Usage
```json
{
    "type": "DawnLib:moon:has_tag",
    "value": "lethal_company:vanilla"
}
```

```json
{
    "type": "DawnLib:dungeon:has_tag",
    "value": "lethal_company:vanilla"
}
```