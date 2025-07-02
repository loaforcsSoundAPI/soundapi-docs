It's recommended to follow the SoundAPI naming convention for your conditions, mappings, config, etc.

Most names will be broken down into `Part1:Part2:Part3`. You should have 2 or 3 parts. You should *never* have spaces.

> [!NOTE]
> Sometimes `parts` are inter-changeably called `sections`

SoundAPI (will) reserve 1 part for itself for things that are generic across games (e.g: `config`, `mod_installed`).

## Casing
The first part is `PascalCase`, following parts are `snake_case`.

### Invalid Examples
`my_mod:my_condition` - first part is not `PascalCase` <br>
`MyMod:MyCondition` - second part is not `snake_case`

## Conditions/Mappings
These should be prefixed with either:
- your mod name (e.g: `FacilityMeltdown`)
- or the game name (only when making specific game bindings! e.g: `LethalCompany`)

### Valid Examples
`FacilityMeltdown:meltdown_music` <br>
`LethalCompany:dungeon:name`

## Config
Becuase configs are private to your mod, you do not need to prefix them with your mod name. 
Instead the naming convention is required to fill out information to generate the file.

For example the name `SoundReplacements:replace_spider_sounds` is generated in the config file as:
```toml
[SoundReplacements]
## Other information from config file
replace_spider_sounds = true
```
[Learn more about configs](/soundpack-tutorials/advanced/config)