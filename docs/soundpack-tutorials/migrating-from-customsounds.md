Before SoundAPI, [CustomSounds](https://thunderstore.io/c/lethal-company/p/Clementinise/CustomSounds/) was the main API to replace sounds. <br>
LCSoundTool/CustomSounds are now old and should be slowly moved away from.

## For Players
For players who just want to use old mods made with CustomSounds, [EchoLoader](https://thunderstore.io/c/lethal-company/p/loaforc/EchoLoader/) is an experimental project to load these legacy mods with SoundAPI.

## For Sound-Pack Creators
There currently are no easy tools to convert packs made with CustomSounds to SoundAPI. 
This tool may be made in future, but it's recommended to just [start a new project](/soundpack-tutorials/guide/getting-started).

> [!WARNING]
> Please, do not use EchoLoader to continue making packs in the CustomSounds style.
>
> Not only do you miss out on SoundAPI features, but the way LCSoundTool makes sound replacements (and EchoLoader emulates them) is not recommended. (equivalent to doing `*:clipName` in SoundAPI)