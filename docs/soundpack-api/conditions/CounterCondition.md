## Counter Condition
Increments a counter by one every time this condition is evaluated.

For the following example, it will trigger once every 5 times.
Be careful when using with `and`, `nand`, `or` or `nor` as these have performance optimizations that may skip increasing the counter in some cases.

### Properties
| Name | Type | Default |
|--------|-------|---------|
| ResetsAt | Int32 | N/A |
| Value | [ValueRange](/soundpack-api/value-range) | N/A |

### Usage
```json
{
    "type": "counter",
    "resets_at": "5"
}
```
