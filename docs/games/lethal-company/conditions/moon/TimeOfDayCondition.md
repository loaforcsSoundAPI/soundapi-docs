## Time Of Day Condition
Checks the current approximate time on the current moon. This affects the icon shown in the clock UI, and a stinger is played when this changes.

### DayMode
- `dawn`
- `noon`
- `sundown`
- `midnight`

### Properties
| Name | Type | Default |
|--------|-------|---------|
| Value | [DayMode](#daymode) | N/A |

### Usage
```json
{
    "type": "LethalCompany:moon:time_of_day",
    "value": "sundown"
}
```
