> [!IMPORTANT]
> This page assumes you have **BepInEx** and **SoundAPI** installed and have loaded the game at least twice
> 
> It is also **HEAVILY** recommended you enable all types of logging in BepInEx console through its configuration file
> 
> If you end up struggling to follow this guide, there's no shame in downloading someone else's mod to learn from it

It's recommended to look at [Recommended Tools](/soundpack-tutorials/recommended-tools) first, to see what you might have to download.

## Folder Structure
The following folders and files need to be created, and then placed into the `Plugins` folder created by BepInEx. 

```
   BepInEx/ 
    ├── plugins/ 
    │   └──── <Sound-Pack Name Here>/  
    │          ├── replacers/ 
    │          │     └── examplereplacer.json 
    │          ├── sounds/ 
    │          │     └── <Sound Files Here> 
    │          └── sound_pack.json 
    └── ... 
```

If you plan on uploading your mod to Thunderstore, see the [Lethal Company Wiki](https://lethal.wiki/dev/publishing-your-mod) for an in-depth guide on how to do so.

## Loading the Sound-Pack
loaforcsSoundAPI automatically scans the `BepInEx/plugins` folder for any files named `sound_pack.json`.
The `sound_pack.json` will contain basic information about the mod, but all you need is the following.

```json5
{
    "name": "MySoundMod",
    "version": "1.0.0"
}
```

`name` is ***required***, but can be different to the folder name. <br/>
`version` is not required, but is heavily recommended. <br/>
If you now run the game, the following should appear in the BepInEx console:
```console
[Info   :me.loaforc.soundapi] Starting Sound-pack loading pipeline
[Info   :me.loaforc.soundapi] (Step 1) Loading Sound-pack definitions took 59ms
[Info   :me.loaforc.soundapi] (Step 2) Loading Sound-pack mappings ('0') took 1ms
[Info   :me.loaforc.soundapi] (Step 3) Skipped 0 collection(s), 0 replacement(s), 0 sound(s)
[Info   :me.loaforc.soundapi] (Step 3) Loading sound replacement collections took 5ms
[Info   :me.loaforc.soundapi] (Step 4) Started loading 0 audio file(s)
[Info   :me.loaforc.soundapi] Starting AudioManager.
[Warning:me.loaforc.soundapi] The game will freeze for a moment!
[Info   :me.loaforc.soundapi] (Step 5) All file reads are done, waiting for the audio clips conversions.
[Info   :me.loaforc.soundapi] (Step 6) Took 3ms to finish loading audio clips from files
[Info   :me.loaforc.soundapi] Entire load process took an effective 78ms
```

If there are no "Error" messages related to SoundAPI in the log, you've done it correctly!