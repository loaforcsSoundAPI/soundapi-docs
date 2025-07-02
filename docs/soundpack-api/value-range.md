A value range is a way to define a range of numbers to check for, including decimals.
Without the range operator if we wanted to check for values between 0 and 50, we would need to do an OR Condition with 50 different value checks.

There are 4 different types of range operators:
- `"5"` only returns true if the input is exactly `5`.
- `"5.."` returns true if the input is equal to or greater than `5`
- `"5..15"` returns true if the input is equal to or greater than `5` AND equal to or less than `15`.
- `"..15"` returns true if the input is equal to or less than `15`.