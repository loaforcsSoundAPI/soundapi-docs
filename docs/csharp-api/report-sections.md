> [!WARNING]
> The Sound Report API will be massively reworked in `v2.1`.

You can define a custom Report Section by using `SoundReportHandler.AddReportSection`. Note that `SoundReportHandler` also has the utility methods `WriteList` and `WriteEnum` to keep consistency across the file.
## Example
```cs
AddReportSection("General Information", (stream, report) => {
    stream.WriteLine($"SoundAPI version: `{MyPluginInfo.PLUGIN_VERSION}` <br/><br/>");
    
    stream.WriteLine($"Audio-clips loaded: `{report.AudioClipsLoaded}` <br/>");
    stream.WriteLine($"Match strings registered: `{SoundPackDataHandler.SoundReplacements.Values.Sum(it => it.Count)}` <br/>");
    
    SoundReportHandler.WriteList("Loaded sound-packs", stream, report.SoundPackNames);
});
```