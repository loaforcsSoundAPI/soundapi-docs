> [!WARNING]
> `soundapi_mappings.json` will be deprecated in `2.1` to be replaced with the `mappings` SourceSet.
> `soundapi_mappings.json` will continue to work in this future version with warnings.

Mappings are for a mod developer to write a shortcut to one or more sound matches. It's recommended sound pack creators use mappings where possible for forward compatibility (as the mod dev can update the mapping file with a mod update, without the sound pack needing to update.)

To use mappings you need to include a `sound_pack.json` in your mod zip (this is so SoundAPI loads it automatically, an option to load them via the SoundAPI class may come later). 

You do not need to include a `replacers` or `sounds` folder. 
A `soundapi_mappings.json` file then goes in the same folder.

Example `soundapi_mappings.json` file:

```json
{
    "FacilityMeltdown:music": [
        "MeltdownHandler:MeltdownMusic:meltdownMusic"
    ],
    "FacilityMeltdown:warning_voice": [
        "MeltdownHandler:WarningVoice:warning1",
        "MeltdownHandler:WarningVoice:warning2",
        "MeltdownHandler:WarningVoice:warning3",
        "MeltdownHandler:WarningVoice:warning4"
    ]
}
```

Sound-pack creators will then use your mappings in their replacers. Mappings in matches are prepended with a #.

```json
{
    "replacements": [
        {
            "matches": "#FacilityMeltdown:music",
            "sounds": [
                {
                    "sound": "meltdown.ogg"
                }
            ]
        }
    ]
}
```