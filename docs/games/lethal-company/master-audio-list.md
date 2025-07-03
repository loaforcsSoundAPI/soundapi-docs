
## Info

> [!TIP]
>"!!!" Is marked on things that may be inaccurate - Confirmation would be appreciated
>
>"[Looping]" is marked on sounds that loop

> [!IMPORTANT]
> You can use a * to bind a sound to all GameObjects/AudioSources. This may cause overlap with some sounds (e.g. BitePlayer, Step1-6,PressButton1-2), but is generally an easier method

> [!CAUTION]
> Some sounds may not have a GO/AS. A * should be used in these cases

------
## Trivia

- BreakerBoxOpen/Close and DoorOpen/Close are actually inverted
- The store dropship plays music for ~30 seconds
- The jester's windup time varies by ~5 seconds
- The Nutcracker's music resets every time it fires
- JetpackThrust1 has to be extremely loud to sound normal volume ingame
- Opening a gift box plays the sound for dropping the gift box and whatever it turned into at the same time
- The phone scrap only screams at you when you hold it for the second time, not the first time you pick it up
- You can still hear the player and surrounding sounds on the walkie even though "WalkieTalkieCutOut" is already playing. 
	If you want something to play after this period has passed, add delay to your audio equivalent in length to the static
- MaskComedyAttach is the sound for having the mask be attached to your face, 
	but ironically the sound source isn't attached to the player and just stays where it started playing in the world. 
	This is likely a bug
- WoodCreak is an ambient sound, not to be confused with WoodB which is the sound for walking on the wooden floor of the mansion, 
	not to be confused with WoodStep which is for walking on the stairs and bookshelves of the mansion (zeek, why)
- "HighAction1" and "HighAction2" play when you are in immediate danger/see something scary, with the three crossfading in volume depending on how dangerous the environment is. 
	"LowAction" plays for ~8 seconds after you are no longer in danger and then fades out completely. 
	The pitch/speed of these sound files varies by +-8%, so if you plan on making it music ONLY use "LowAction" and ONE "HighAction" file and replace the other with silence

## Misc

<details>
<summary>V50 Intro</summary>

- ColdOpen1AnimContainer:
  - AirUnitAudio:AirConditioner
    - [Looping] 
  - AirUnitAudioSwitchOff:AirConditionerSwitch
    - Turn off
  - WarAudio:BackgroundAmbience
    - Intro constantly in the background
  - DoorOpenSFX:WindyDoorOpen
    - Intro door behind you opening

- Blast1: (First stage of intro)
  - OutsideAudio:Blast1
    - Background explosions
  - AroundEarsAudio:Quake1
    - Close room vibrations
  - AroundEarsAudio:Rumble2Global
    - Far room vibrations

- Rumble2: (Second stage of intro)
  - OutsideAudio:Blast2
    - Background explosions
  - AroundEarsAudio:Quake1
    - Close room vibrations
  - AroundEarsAudio:Rumble2Global
    - Far room vibrations
  - OutsideAudio:Rumble2Local
    - Far room vibrations

- Rumble3: (Third stage of intro)
  - AroundEarsAudio:Quake1
    - Close room vibrations
  - AroundEarsAudio:Rumble2Global
    - Far room vibrations
  - OutsideAudio:RumbleDesk
    - Desk shaking

- FireAlarm: (Second stage of intro)
  - InRoomAudioCenter:CloseFireAlarm
  - OutsideAudio:DistantFireAlarm

- NormalOfficeSounds: (Second stage of intro)
  - OutsideAudio:NormalOfficeSounds
	
</details>

- Ship lightswitch
  - LightSwitchContainer:LightSwitch:FlashlightClickMini
  - LightSwitchContainer:LightSwitch:FlashlightClickMini2

GameObjects/AudioSources for room types (Unsorted, may be missing ones!!!)

Can be added to [LightFlicker, LightOn, LightOff] sounds to specify which room(s) to play in.

<details>
<summary>Click To Open</summary>

- 4x4BigStairTile
- 4x4ServerRoomTile
- CatwalkTile2x1
- CatwalkTile2x1Split
- CeilingLight:
  - HangingLight
- CloverTileLampSpawn
- CloverTileLampSpawnBVariant
- CloverTileLampSpawnCVariant
- Diagonal1Tile
- DoubleDoorRoom
- HallwayCloverIntersection
- HallwayCloverInverse
- HallwayCorner
- HallwayTileTypeA
- HallwayTileTypeB
- HallwayTileTypeC
- HallwayTileTypeD
- KitchenTile
- LampOnBars:
  - HangingLight
- LampOnBarsB:
  - HangingLight
- LargeForkTileB
- LargeHallwayOpeningTile
- LibraryTile
- Lights:
  - HangingLight
- LivingRoomTile
- ManorStairTile
- ManorStartRoom
- MediumRoomHallway1B
- Side1:
  - HangingLight
- Side2:
  - HangingLight
- SmallLRoom
- SmallPillarRoom
- SmallStairTile
- StartRoom:
  - HangingLight
- StartRoom
- THallwayIntersectionB
- TestRoom
- WindowTile

</details>

## Items

The list structure goes as follows:

- [Item Name]
  - [Interaction]
    - [GameObject Name]:[AudioSource Name]:[Sound Name]
      - [Explanation]

Valid GameObjects: HangarShip(In Ship), Props(Outside), Audios(General), StorageCloset(Ship Cupboard)

------
<details>
<summary>Scrap</summary>

- Airhorn
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - Airhorn:DropPlastic1
  - Use
    - Airhorn:AirHorn1
      - Nearby sound for airhorn
    - Airhorn:FarAudio:AirHornFar
      - Far away sound for airhorn
- Apparatus
  - Drop
    - LungApparatusTurnedOff:DropMetalObject2
  - Remove from wall
    - DisconnectLungDevice
      - Remove apparatus from socket
    - LightFlicker
      - Light flickering inside after removal from socket (See [Misc] for GO/AS)
- Bee hive
  - Pickup
    - ItemAudio:BeeHiveGrab
  - Drop
    - RedLocustHive:BeeHiveDrop
- Big bolt
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - BigBolt:DropMetalObject1
- Bottles
  - Pickup
    - ItemAudio:PickUpPlasticBin
  - Drop
    - BinFullOfBottles:DropBottle
- Brass Bell
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - HandBell:DropBell
- Candy
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Candy:DropPlastic2
- Cash register
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - CashRegisterItem:DropMetalObject3
  - Use
    - Props:CashRegisterItem:CashRegisterDing
- Chemical jug
  - Pickup
    - ItemAudio:PickUpPlasticBin
  - Drop
    - ChemicalJug:DropJug
- Clown horn
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - Clownhorn:DropPlastic1
  - Use
    - Clownhorn:ClownHorn1
      - Nearby sound for airhorn
    - ClownHornFar
      - Far away sound for airhorn
- Coffee mug
  - Pickup
    - ItemAudio:PickUpPlasticBin
  - Drop
    - Mug:DropPlastic1
- Cookie mold pan
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - CookieMoldPan:DropThinMetal
- DIY-Flashbang
  - Pickup
    - ItemAudio:GrabBottle
  - Drop
    - DiyFlashbang:DropBottleSingle
  - Use
    - DiyFlashbang:HomemadeFlashbangPullCork
      - DIY-flashbang pull cork
- Double-barrel shotgun
  - Pickup
    - ItemAudio:GrabShotgun
  - Drop
    - ShotgunItem:DropGun
  - Use
    - GunShootSFX:ShotgunBlast/ShotgunBlast1
- Dramatic Masks
  - Vocals
    - TragedyMask/ComedyMask:MaskLaugh1
    - TragedyMask/ComedyMask:MaskLaugh2
    - TragedyMask/ComedyMask:MaskLaugh3
    - TragedyMask/ComedyMask:MaskCry1
    - TragedyMask/ComedyMask:MaskCry2
    - TragedyMask/ComedyMask:MaskCry3
    - TragedyMask/ComedyMask:MaskCry4
  - Comedy
    - Pickup
      - ItemAudio:GrabCardboardBox
    - Drop
      - ComedyMask:DropCardboardBox
    - Attach
      - UIAudio:MaskComedyAttach
  - Tragedy
    - Pickup
      - ItemAudio:GrabCardboardBox
    - Drop
      - TragedyMask:DropCardboardBox
    - Attach
      - UIAudio:MaskTragedyAttach  
- Dust pan
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Dustpan:DropPlastic2
- Easter egg
  - Pickup
    - ItemAudio:EasterEggHitGround
  - Drop
    - EasterEgg:EasterEggHitGround2
  - Explode
    - EasterEgg:ItemSFX:EasterEggPop
- Egg beater
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - EggBeater:DropPlastic1
- Fancy lamp
  - Drop
    - FancyLamp:DropMetalObject2
- Flask
  - Pickup
    - ItemAudio:GrabBottle
  - Drop
    - Flask:DropGlass1
- Gift box
  - Pickup
    - ItemAudio:GrabCardboardBox
  - Drop
    - GiftBox:DropCardboardBox
  - Use
    - GiftBox:Audio Source:OpenBox (not a typo)
- Gold bar
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - GoldBar:DropMetalObject3
- Golden cup
  - Drop
    - FancyGlass:DropMetalObject1
- Hair brush
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Hairbrush:DropPlastic2
- Hairdryer
  - Pickup
    - ItemAudio:PickUpPlasticBin
  - Drop
    - Haidryer:DropPlastic2
  - Use
    - Hairdryer:Hairdryer1
      - Nearby sound for hairdryer
    - Hairdryer:FarAudio:HairdryerFar
      - Far away sound for hairdryer
- Jar of pickles
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - PickleJar:DropGlass1
- Key
  - Pickup
    - ItemAudio:GrabKey
  - Drop
    - Key:DropKey
  - Unequip
    - Key:PocketKey
  - Equip
    - Key:GrabKey
- Knife
  - Pickup
    - ItemAudio:GrabKnife
  - Drop
    - KnifeItem:DropKnife
  - Stab
    - KnifeItem:KnifeAudio:KnifeStab
	- KnifeItem:KnifeAudio:KnifeStab2
  - Swing
    - KnifeItem:KnifeAudio:SwingKnife
    - KnifeItem:KnifeAudio:SwingKnife2
    - KnifeItem:KnifeAudio:SwingKnife3
- Large axle
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Cog:DropMetalObject3
- Laser pointer
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - LaserPointer:DropFlashlight
  - Use
    - LaserPointer:FlashlightClickMini/FlashlighClickMini2
- Magic 7 ball
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Magic7Ball:DropMetalObject1
- Magnifying glass
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - MagnifyingGlass:DropGlass1
- Old phone
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - OldPhone:DropMetalObject1
  - Holding
    - OldPhone:PhoneScream
- Painting
  - Pickup
    - ItemAudio:PickUpPlasticBin
  - Drop
    - Painting:DropPlasticLarge
- Perfume bottle
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - PerfumeBottle:DropPlastic1
- Pill bottle
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - PillBottle:DropMetalObject1
- Plastic fish
  - Drop
    - FishTestProp:DropPlastic2
- Red soda
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - RedSodaCan:DropMetalObject1
- Remote
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Remote:DropPlastic1
  - Use
    - Remote:RemoteClick
- Ring
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - FancyRing:DropMetalObject1
- Robot toy
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - RobotToy:DropPlasticLarge
  - Holding
    - RobotToy:RobotToyCheer
      - [Looping] Sound when in inventory
- Rubber ducky
  - Pickup
    - DuckQuack
  - Drop
    - DropRubberDuck
- Steering wheel
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - SteeringWheel:DropPlasticLarge
- Stop sign
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - StopSign:DropMetalObject2
- Tattered metal sheet
  - Drop
    - MetalSheet:DropThinMetal
- Tea kettle
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - TeaKettle:DropThinMetal
- Teeth
  - Drop
    - Dentures:DropPlastic1 
  - Hold
    - Dentures:ChatteringTeeth
      - [Looping] Teeth scrap sound when holding
- Toothpaste
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - Toothpaste:DropPlastic2
- Toy cube
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - ToyCube:DropPlastic2
- V-type engine
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - EnginePart:DropMetalObject3
- Whoopie-cushion
  - StepOn
	- WhoopieCushion:Fart1
    - WhoopieCushion:Fart2
    - WhoopieCushion:Fart3
    - WhoopieCushion:Fart5
- Yield sign
  - Pickup
    - ItemAudio:ShovelPickUp
  - Drop
    - YieldSign:DropMetalObject2

</details>

<details>
<summary>Store</summary>

- Boombox
  - Drop
    - Boombox:DropHeavyBox1
  - Use
    - Boombox:BoomboxMusic1
    - Boombox:BoomboxMusic2
    - Boombox:BoomboxMusic3
    - Boombox:BoomboxMusic4
    - Boombox:BoomboxMusic5Zedfox
      - Boombox songs
  - Stop
    - Boombox:BoomboxStop
      - Pausing boombox
	
- Extension ladder
  - Drop
    - ExtensionLadderItem:DropMetalBox
  - Use
    - ExtensionLadderItem:LadderAudio:ExtensionLadderAlarm
      - [Looping] Ladder time out alarm
    - ExtensionLadderItem:LadderAudio:ExtensionLadderExtend
      - Ladder extend
    - ExtensionLadderItem:LadderAudio:ExtensionLadderHitWall
    - ExtensionLadderItem:LadderAudio:ExtensionLadderHitWall2
      - Ladder hit wall/ground
    - ExtensionLadderItem:LadderAudio:ExtensionLadderLidOpen
      - Ladder Box lid open
    - SoundManager:TempAudio1:ExtensionLadderMetalSlam
      - Ladder impact player
    - ExtensionLadderItem:LadderAudio:ExtensionLadderShrink
      - Ladder retract
    - ExtensionLadderItem:LadderAudio:FallingAir
      - Ladder falling over  
- Flashlight
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - BBFlashlight:DropFlashlight
	  - Basic Flashlight
	- FlashlightItem:DropFlashlight
	  - Pro-Flashlight
  - Use
    - FlashlightItem:FlashlightClick
      - Toggle Pro-flashlight
    - BBFlashlight:FlashlightClickMini
    - BBFlashlight:FlashlightClickMini2
      - Toggle basic-flashlight
    - (Unknown!!!):FlashlightFlicker
      - Flashlight flicker when low on battery
    - FlashlightItem:FlashlightMiniOutOfBatteries
      - Basic-flashlight turn off when out of battery
    - FlashlightItem:FlashlightOutOfBatteries
      - Pro-flashlight turn off when out of battery
	
- Jetpack
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - JetpackItem:DropFlashlight
  - Use
    - JetpackItem:ThrusterAudioClose:JetpackThrust1
      - [Looping] When using
    - JetpackItem:ThrusterAudioClose:JetpackThrustStart
      - Start using
    - JetpackItem:BeepSFX:JetpackWarningBeep
      - Warning when using
    - JetpackItem:BeepSFX:JetpackWarningBeep2
      - Warning when using and low on fuel

- Lockpicker
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - LockPickerItem:DropMetalObject1
  - Use
    - LockPickerItem:LockPickerFinish
      - Lockpicker door unlocked
    - SteelDoorMapModel:LockPickerItem:LockPickerMount
      - Lockpicker place on door
    - SteelDoorMapModel:LockPickerItem:LockPickerPicking
      - [Looping] Lockpicker while picking door

- Radar-booster
  - Drop
    - RadarBoosterDevice:GhostDeviceHitGround
  - TurnOn
    - RadarBoosterDevice:RadarBoosterAudio:GhostDeviceFullyCharged
  - TurnOff
    - RadarBoosterDevice:RadarBoosterAudio:GhostDeviceTurnOff
  - Ping
    - RadarBoosterDevice:BoosterPingAudio:GhostDevicePing
      - Radar booster sound when "ping" command is used from ship
  - Flash
    - RadarBoosterDevice:RadarBoosterAudio:RadarBoosterFlash
	  - Radar booster sound when "flash" command is used from ship
  - TurnedOn
    - RadarBoosterDevice:RadarBoosterAudio:GhostDeviceHum
      - [Looping] Radar booster hum when power on
  
- Shovel
  - Pickup
    - ItemAudio:GrabShovel
  - Drop
    - ShovelItem:DropShovel
	
- Spray Paint
  - Pickup
    - ItemAudio:HoldTZP
  - Drop
    - SprayPaintItem:DropCan
  - Use
    - SprayPaintItem:ShakeEmptyCan
      - Shake empty spray can
    - SprayPaintItem:ShakeSpraycan
      - Shake spray can
    - SprayPaintItem:
      - ShakeSpraycanFull1
      - ShakeSpraycanFull2
      - ShakeSpraycanFull3
      - ShakeSpraycanFull4
        - Shake spray can with paint inside
    - SprayPaintItem:SprayEmpty
      - Spraycan out of paint
    - SprayPaintItem:SprayNeedsShaking
      - [Looping] Spraycan out of pressure
    - SprayPaintItem:SpraySpraycan
      - [Looping] Spraycan spraying paint
    - SprayPaintItem:SprayStart
      - Begin using spraypaint

- Stun grenade
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - StunGrenade:DropFlashlight
  - Use
    - StunGrenade:FlashbangExplode
      - Flashbang explosion, used by: Stun grenade, DIY-Flashbang
    - StunGrenade:FlashbangPullPin
      - Stun grenade pin pull
	
- TZP-Inhalant
  - Pickup
    - ItemAudio:HoldTZP
  - Drop
    - TZPChemical:DropCan
  - Use
    - TZPChemical:ItemGasSFX:CanEmpty
      - TZP out of juice
    - TZPChemical:LocalHelmetSFX:ReleaseHelmetGas
      - Begin using TZP
    - TZPChemical:LocalHelmetSFX:ReleaseHelmetGas2
      - [Looping] while using TZP
	
- Walkie-talkie
  - Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - WalkieTalkie:DropFlashlight
  - Use
    - WalkieTalkie:
      - WalkieTalkieCutOut
        - Static when player on other end is being killed
      - WalkieTalkieOff
      - WalkieTalkieOn
      - WalkieTalkieTalkingNotHeld
        - Radio being used in someone else's hand (Unused!!!)
      - WalkieTalkieTransmissionOff
      - WalkieTalkieTransmissionOff2
      - WalkieTalkieTransmissionOff3
      - WalkieTalkieTransmissionOff4
      - WalkieTalkieTransmissionOff5

- Zap gun
	Pickup
    - ItemAudio:GrabFlashlight
  - Drop
    - PatcherGunItem:DropMetalObject2
  - Use
    - PatcherGunItem:GunMesh:GunOverheat
      - Zap gun overheated
    - PatcherGunItem:GunMesh:GunOverheatWarning
      - Zap gun near overheating alarm
    - PatcherGunItem:GunMesh:GunScan
      - Zap gun 
    - PatcherGunItem:GunMesh:PatcherDetectAnomaly
      - Zap gun lock onto target
    - Curve2:ShockBeam1
      - [Looping] Zap gun firing
    - PatcherGunItem:AimDirection:ShockBeam2
      - [Looping] Zap gun firing

</details>


## Entities

The list structure goes as follows:

- [Entity Name]
  - [GameObject Name]
    - [AudioSource Name]:[Sound Name]
      - [Explanation]

------
### Living

<details>
<summary>Baboon Hawk</summary>

- BaboonHawkEnemy: (AggressionSFX = Baboon is hostile, CreatureVoice = Baboon isnt hostile)
  - AggressionSFX:BaboonEnterFight
    - Hostility noise
  - CreatureVoice:BaboonKill
    - Player death: Killed by baboon
  - CreatureSFX:BaboonStab
    - Attack player
  - CreatureSFX:BaboonTakeDamage
    - Take damage
  - AggressionSFX/CreatureVoice:Caw1
    - Random vocalisation!!!
  - AggressionSFX/CreatureVoice:CawScream1
  - AggressionSFX/CreatureVoice:CawScream2
  - AggressionSFX/CreatureVoice:CawScream3
  - AggressionSFX/CreatureVoice:CawScream4
  - AggressionSFX/CreatureVoice:CawScream5
    - Vocalisation
  - CreatureSFX:Footstep1
  - CreatureSFX:Footstep2
  - CreatureSFX:Footstep3
  - CreatureSFX:Footstep4
  - CreatureSFX:Footstep5
    - Baboon footsteps
  - CreatureVoice:KillBaboon
    - Baboon death
  - AggressionSFX/CreatureVoice:Squeak1
  - AggressionSFX/CreatureVoice:Squeak2
    - Vocalisation

</details>

<details>
<summary>Butler</summary>

- ButlerEnemy:
  - PopAudio:BalloonPop
    - Explode
  - PopAudioFar:BalloonPopReverb
    - Explode reverb
  - CreatureSFX:BroomSweep1
  - CreatureSFX:BroomSweep2
  - CreatureSFX:BroomSweep3
  - CreatureSFX:BroomSweep4
    - Sweeping with broom
  - PopAudio:ButlerBlowUp
    - Pre-explode enlarge
  - Buzzing:ButlerBuzzingAmbience
    - [Looping] 
  - Ambience:ButlerIdleAmbience
    - [Looping] 
  - CreatureSFX:ButlerStab1
    - Stab player
  - CreatureSFX:ButlerStep1
  - CreatureSFX:ButlerStep2
  - CreatureSFX:ButlerStep3
  - CreatureSFX:ButlerStep4
  - CreatureSFX:ButlerStep5
    - Footsteps
  - CreatureSFX:ButlerSuitRustle
    - Pull out/Put back broom 
  - CreatureSFX:ButlerUntuckKnifeSFX
    - Pull out knife

- (Null):
  - Ambience2:ButlerMurderTheme
    - [Looping] 

- ButlerBees:
  - AngrySFX:ButlerBeeSwarm
    - [Looping] Swarm that spawns after butler explodes

</details>

<details>
<summary>Bees</summary>

- RedLocustBees:
  - AngrySFX:
    - BeesAngry
	  - [Looping] Bees hostile when you are holding the beehive
  - BeeZapConstant
    - [Looping] While you are being shocked
  - DefendingSFX:BeesDefensive
    - [Looping] Bees hostile when you are in proximity but not holding the beehive

- Target:
  - ZapSFX:BeeZap1
  - ZapSFX:BeeZap2
  - ZapSFX:BeeZap3
  - ZapSFX:BeeZap4
  - ZapSFX:BeeZap5
  - ZapSFX:BeeZap6
    - Random zap sounds when bees are hostile
	
- IdleSFX:BeeHiveIdle
  - [Looping] Bees Idling at beehive

</details>


<details>
<summary>Bracken</summary>

- AnimContainer:
  - AngerVoice:Angered
    - Hostility noise
  - NeckCrackAudio:CrackNeck
    - Player death: Killed by Bracken

- (Null)
  - Flowerman:StunFlowerman
    - Hit by Zap gun
  - Flowerman:Found1
    - Seen when stalking
  - Flowerman:Rustle1
  - Flowerman:Rustle2
  - Flowerman:Rustle3
  - Flowerman:Rustle4
    - Footsteps 1/2
  - Flowerman:Step1
  - Flowerman:Step2
  - Flowerman:Step3
  - Flowerman:Step4
    - Footsteps 2/2

</details>


<details>
<summary>Coil-Head</summary>

- SpringManModel:
  - FoostepSFX(Not a typo):BareFootstep1
  - FoostepSFX:BareFootstep2
  - FoostepSFX:BareFootstep3
  - FoostepSFX:BareFootstep4
    - Footsteps
  - VoiceSFX:Spring1
  - VoiceSFX:Spring2
  - VoiceSFX:Spring3
    - Stop moving when observed by player
  - VoiceSFX:SpringWobble1
  - VoiceSFX:SpringWobble2
    - Stop moving when observed by player
- PlayerRagdollSpring Variant:
  - ExplodeHeadSFX:KillPlayerSpring
    - Player death: Killed by Coilhead
  - ExplodeHeadSFX2:ExplodeHeadSecondarySFX
    - Secondary sound after being killed

</details>


<details>
<summary>Eyeless Dog</summary>

- (Null)
  - MouthDog:Lunge1
    - Sliding towards sound source
  - MouthDog:Stomp1double
  - MouthDog:Stomp2double
  - MouthDog:Stomp3double
    - Footsteps

- MouthDogModel:
  - VoiceAudio:Breathe1
    - [Looping] calm breathing
  - VoiceAudio:growl (not a typo)
    - Investigating noise source
  - VoiceAudio:Roar
    - About to attack noise source
  - VoiceAudio:StunDog
    - Hit by Zap gun
  - VoiceAudio:KillPlayer
    - Player death: Killed by Eyeless Dog

</details>


<details>
<summary>Snare Flea</summary>

- Centipede:
  - CentipedeModel:CentipedeWalk
    - Movement sound
  - (Unknown!!!):ClingToPlayer
    - [Looping] Grabbed onto player, sound other players hear
  - ClingToPlayer2DSFX:ClingToPlayerLocal
    - [Looping] Grabbed onto player, sound victim hears
  - VoiceSFX:DeathShriek
    - Snare flea death
  - CentipedeModel:monsterNoise (lowercase is not a mistake)
    - (!!!)
  - CentipedeModel:monsterNoise2 (lowercase is not a mistake)
    - Attach to ceiling
  - VoiceSFX:Shriek1
  - VoiceSFX:Shriek2
    - Take damage
  - CentipedeModel:Shriek1
  - CentipedeModel:Shriek2
    - Fall onto ground from ceiling
  - CentipedeModel:SlamGround
    - Hit ground after falling
- CentipedeModel
  - VoiceSFX:monsterNoiseB (lowercase is not a mistake)
    - Begin falling from ceiling
- MeatyHit
  - Take damage

</details>


<details>
<summary>Forest Giant</summary>

- FGiantModelContainer:
  - FarWideSFX:DistantRumble1
  - FarWideSFX:DistantRumble2
  - FarWideSFX:DistantRumble3
    - Far away footsteps
  - CloseWideSFX:FGiantEatPlayerSFX
    - Player death: Killed by Forest Giant
  - CloseWideSFX:GiantStomp1
  - CloseWideSFX:GiantStomp2
  - CloseWideSFX:GiantStomp3
  - CloseWideSFX:GiantStomp4
  - CloseWideSFX:GiantStomp5
    - Nearby footsteps
  - VoiceSFX:StunGiant
    - Hit by Zap gun
  - CloseWideSFX:Roar
    - Pick up player
  - BurningSFX:ForestGiantBurn
    - On fire

- (Unknown!!!):
  - (Unknown!!!):ForestGiantDie - unused? (!!!)
  - (Unknown!!!):ForestGiantFall - unused? (!!!)


</details>


<details>
<summary>Little Girl</summary>

- DressGirlModel:
  - VoiceSFX:Breath1
  - VoiceSFX:Breath2
  - VoiceSFX:Breath3
    - Occasionally plays when manifests
  - VoiceSFX:Breathing
    - [Looping] Breathing while manifested
  - VoiceSFX:Stepping1
    - Occasionally plays when manifests
  - VoiceSFX:Wheeze
    - Occasionally plays when manifests
  - VoiceSFX:Laugh1
  - VoiceSFX:Laugh2
    - Laugh tracks

- (Null)
  - DressGirl:
    - Breath1
    - Breath2
    - Breath3
      - Occasionally plays while manifested
    - Breathing
      - [Looping] Breathing while manifested
    - SkipWalk
     - Walking out of sight before demanifesting
    - SkipWalk1
    - SkipWalk2
    - SkipWalk3
    - SkipWalk4
    - SkipWalk5
    - SkipWalk6
      - Footsteps while chasing player
    - Stepping1
      - Occasionally plays when manifests
    - Wheeze
      - Occasionally plays when manifests
    - Laugh1
    - Laugh2
      - Laugh tracks

- PlayerRagdollHeadBurst Variant:
  - ExplodeHeadSFX:ExplodeHead
    - Player death: Killed by little girl

- (Null)
  - BellChimeAmbience
    - [Looping] Ambience while manifested
	
- HangarShip:
  - FlashlightItem:FlashlightFlicker
    - Light flickering when demanifesting

</details>


<details>
<summary>Hoarder Bug</summary>

- (Null)
  - HoarderBug:BugWalk1
  - HoarderBug:BugWalk2
  - HoarderBug:BugWalk3
  - HoarderBug:BugWalk4
    - Footsteps
  - HoarderBug:Fly
    - [Looping] Using wings when hostile
	
- AnimContainer:
  - Voice:Angry
    - [Looping] Hostility noise
  - Voice:Chitter1
  - Voice:Chitter2
  - Voice:Chitter3
    - See Player
  - Voice:AngryScreech
  - Voice:AngryScreech2
    - Hostility noise

- BugDie
  - Unused!!!
- HoarderBugCry
  - Unused!!!

</details>


<details>
<summary>Jester</summary>

- JesterEnemy:
  - FarAudio:JackInTheBoxTheme
    - Windup music
  - FarAudio:JesterStomp1
  - FarAudio:JesterStomp2
  - FarAudio:JesterStomp3
    - Footsteps
  - KillPlayer
    - Player death: Killed by Jester
  - SFXAudio:Pop1
    - Box lid open
  - VoiceAudio:Scream1
    - [Looping] Hostility sound
  - SFXAudio:TurnCrank1
  - SFXAudio:TurnCrank2
  - SFXAudio:TurnCrank3
    - Windup cranking

</details>


<details>
<summary>Old Bird</summary>

- metarig:
  - 3DLradAudio:LRADAlarm3
    - [Looping] Hostility noise
  - 3DLradAudio2:LradBrainwashingSignal1
  - 3DLradAudio2:LradBrainwashingSignal4
  - 3DLradAudio2:LradBrainwashingSignal6
  - 3DLradAudio2:LradBrainwashingSignal7
  - 3DLradAudio2:LradBrainwashingSignal8
  - 3DLradAudio2:ToWar
  - 3DLradAudio2:robotTune
    - Randomly swaps between when hostile
  - VoiceSFX:NeonLightFlicker
    - Spotlight turn on when activating
  - EngineSFX:RadMechAmbientSFX
    - [Looping] Constant sound when active
  - CreatureSFX:RadMechStomp1
  - CreatureSFX:RadMechStomp2
  - CreatureSFX:RadMechStomp3
  - CreatureSFX:RadMechStomp4
    - Footsteps
  - CreatureSFX:RadMechWake
    - Startup activation
  - CreatureSFX:ShotgunBlast

- RadMechEnemy:  
  - ExplosionAudio:MissileExplosion
  - ExplosionAudio:MissileExplosion2
    - Missile explosion
  - ChargeForwardSFX:ChargeForward
    - Leg thrusters active

- ColdOpen1AnimContainer:
  - AirUnitAudioSwitchOff:AirConditionerSwitch
    - Spotlight turn off

- LeftLowerArm:
  - BlowtorchAudio:Flamethrower
    - Burning player

- FireContainer:
  - ThrusterCloseAudio:MissileFly
    - [Looping] Missile flying

- LeftLegFireContainer:
  - ThrusterFarAudio:FlyingFar
    - [Looping] Flying high up

- Torso:
  - SpotlightOnAudio:SpotlightOn
    - Spotlight turn on when searching for player

- LargeExplosionEffect:
  - InitialBlast:StartChargeForward
    - Leg thrusters turn on


</details>


<details>
<summary>Earth Leviathan</summary>

- (Null)
  - SandWorm:
    - BurrowingGrowl1
      - Pre-emerge sound
    - BurrowingRumble1
    - BurrowingRumble2
    - BurrowingRumble3
      - [Looping] In proximity to player
    - BurrowingRumbleLoud1
      - Pre-emerge sound
    - EmergeFromGround1
      - Emerge from ground

- Bone.002
  - VoiceAudio:SandWormRoar
  - VoiceAudio:SandWormRoar2
    - Roar after emerging

- LandingPosition:
  - GroundAudio:TunnelIntoGround1
    - Impact ground after emerging

</details>


<details>
<summary>Manticoil</summary>

- Bone.001: (Yes, actually)
  - CreatureSFX:BirdScreech1
  - CreatureSFX:BirdScreech2
    - Plays randomly when flying
  - CreatureSFX:DoublewingFlap1
  - CreatureSFX:DoublewingFlap2
  - CreatureSFX:DoublewingFlap3
    - Takeoff from ground
  - KillDoublewing!!!
    - Manticoil death
 
- DoublewingedBird:
  - CreatureSFX:BirdScreech1
  - CreatureSFX:BirdScreech2
    - Plays randomly when flying
  - FlappingAudio:DoublewingFlapConstant
    - [Looping] While flying
  - KillDoublewing!!!
    - Manticoil death
  - StunDoublewing
    - Hit by Zap gun
	
- metarig:
  - FlappingAudio:DoublewingFlapConstant

</details>


<details>
<summary>Masked</summary>

- MaskedPlayerEnemy:
  - CreatureSFX:MaskAttackPlayer
    - Grab onto player
  - CreatureSFX:MaskFaceLightUp
    - Mask eyes light up, used by: Masked grab onto player, when holding mask up to face
  - CreatureSFX:MaskPuke
    - Puke on player
  - VoiceSFX:MaskLaugh1
  - VoiceSFX:MaskLaugh2
  - VoiceSFX:MaskLaugh3
  - VoiceSFX:Laugh1
    - Laugh tracks

- MaskedPlayerEnemy:
  - MovementSFX:Aluminum1
  - MovementSFX:Aluminum2
  - MovementSFX:Aluminum3
  - MovementSFX:Aluminum4
  - MovementSFX:Carpet1
  - MovementSFX:Carpet2
  - MovementSFX:Carpet3
  - MovementSFX:Carpet4
  - MovementSFX:Concrete1
  - MovementSFX:Concrete2
  - MovementSFX:Concrete3
  - MovementSFX:Concrete4
  - MovementSFX:Grass1
  - MovementSFX:Grass2
  - MovementSFX:Grass3
  - MovementSFX:Grass4
  - MovementSFX:Gravel1
  - MovementSFX:Gravel2
  - MovementSFX:Gravel3
  - MovementSFX:Gravel4
  - MovementSFX:Gravel1Wet
  - MovementSFX:Gravel2Wet
  - MovementSFX:Gravel3Wet
  - MovementSFX:Gravel4Wet
  - MovementSFX:MetalWalk
  - MovementSFX:MetalWalk2
  - MovementSFX:MetalWalk3
  - MovementSFX:MetalWalk4
  - MovementSFX:Rock1
  - MovementSFX:Rock2
  - MovementSFX:Rock3
  - MovementSFX:Rock4
  - MovementSFX:Rock5
  - MovementSFX:Snow1
  - MovementSFX:Snow2
  - MovementSFX:Snow3
  - MovementSFX:Snow4
  - MovementSFX:Tile1
  - MovementSFX:Tile2
  - MovementSFX:Tile3
  - MovementSFX:Tile4
  - MovementSFX:Tile5
  - MovementSFX:WoodB1
  - MovementSFX:WoodB2
  - MovementSFX:WoodB3
  - MovementSFX:WoodB4
  - MovementSFX:WoodB5
  - MovementSFX:WoodB6
  - MovementSFX:WoodB7
  - MovementSFX:WoodStep1
  - MovementSFX:WoodStep2
  - MovementSFX:WoodStep3
  - MovementSFX:WoodStep4
    - Footsteps

</details>


<details>
<summary>Nutcracker</summary>

- NutcrackerEnemy:
  - CreatureSFX:BootStomp1
  - CreatureSFX:BootStomp2
  - CreatureSFX:BootStomp3
    - Footsteps
  - LongRangeSFX:AlertedSFX
    - See player moving
  - LongRangeSFX:HeadGoUp
    - Begin scanning area
  - CreatureSFX:Kick
    - Kick player
  - CreatureSFX:MetalSqueak1
  - CreatureSFX:MetalSqueak2
  - CreatureSFX:MetalSqueak3
  - CreatureSFX:MetalSqueak4
    - Footstep raise leg
  - CreatureVoice:NutcrackerAngry
    - Hostility music
  - NutcrackerDie
    - Nutcracker death
  - CreatureSFX:NutcrackerHitEye
    - Take damage
  - TurnBodySFX:NutcrackerTurn
    - [Looping] Rotate when scanning area
  - GunShootSFX:ShotgunBlast
  - GunShootSFX:ShotgunBlast2
    - Shotgun fire, used by: player, nutcracker
  - CreatureSFX:ShotgunReloadNutcracker
    - Reload shotgun
  - TurnBodySFX:StopTurning1
  - TurnBodySFX:StopTurning2
  - TurnBodySFX:StopTurning3
    - Stop turning when scanning area
	
- (Null):
  - VentEntrance:NutcrackerVentCrawl

</details>


<details>
<summary>Spore Lizard</summary>

- PufferEnemy:
  - CreatureVoice:Angry1
    - Preparing to create smoke cloud
  - CreatureVoice:BitePlayer
    - Attack player
  - CreatureSFX:Stomp
    - Ground slam when approached
  - CreatureVoice:Frighten1
  - CreatureVoice:Frighten3
    - See player
  - CreatureVoice:Nervous
    - [Looping] When continuing to see player
  - FootstepSFX:Step1
  - FootstepSFX:Step2
  - FootstepSFX:Step3
  - FootstepSFX:Step4
  - CreatureSFX:PuffSFX
    - Create smoke cloud
  - CreatureSFX:RattleTail
    - Shake tail

</details>


<details>
<summary>Spider</summary>

- MeshContainer:
  - FootstepSFX:Step1
  - FootstepSFX:Step2
  - FootstepSFX:Step3
  - FootstepSFX:Step4
  - FootstepSFX:Step5
  - FootstepSFX:Step6
    - Footsteps
  - VoiceSFX:SpiderDie
    - Spider death
  - VoiceSFX:StunSpider
    - Hit by Zap gun

- spine.002:
  - BodyAudio:HangPlayerOnCeiling
    - Hang cocooned player on ceiling
	
- centerOfWeb:
  - Audio:HitWeb
    - Run into web
  - Audio:StuckInWeb
    - [Looping] Player stuck to web

- (Null)
  - SandSpider:SpiderAttack
    - Attack player
  - SandSpider:SpoolPlayerInWeb
    - [Looping] Turning dead body into cocoon
  - SandSpider:SpiderHit
    - Take damage
  - One shot audio:BreakWeb
    - Break web with shovel

</details>


<details>
<summary>Thumper</summary>

- Crawler:
  - VoiceSFX:BitePlayer
    - Generic attack player
  - VoiceSFX:CrawlerDie
    - Thumper death
  - VoiceSFX:HitCrawler
  - VoiceSFX:HitCrawler2
    - Take damage
  - VoiceSFX:LongRoar1
  - VoiceSFX:LongRoar2
  - VoiceSFX:LongRoar3
    - See player
  - VoiceSFX:StunCrawler
    - Hit by Zap gun

- DoorMesh
  - DoorSound:DoorSlam1
  - DoorSound:DoorSlam2
    - Slam open generic door

- (Null)
  - Crawler:Ram1
  - Crawler:Ram2
  - Crawler:Ram3
    - Impact wall
  - Crawler:Stomp1
  - Crawler:Stomp2
  - Crawler:Stomp3
    - Footsteps

- ShortRoar1
  - (Unused!!!)

</details>


<details>
<summary>Tulip Snake</summary>

- FlowerSnakeEnemy:
  - CreatureVoice:Chuckle1
  - CreatureVoice:Chuckle3
  - CreatureVoice:Chuckle4
  - CreatureVoice:Chuckle5
    - Vocalisation
  - SnakeFlap:FlapWings
  - SnakeFlap:FlapWings2
    - Wing flapping
  - SnakeFlap:FlowerSnakeScurry
    - [Looping] Footsteps
  - CreatureVoice:Leap1
  - CreatureVoice:Leap2
  - CreatureVoice:Leap3
    - Launch towards player

- SoundManager:
  - Misc2D:ClingToPlayer
    - Attach onto player

</details>

### Machinery

<details>
<summary>Landmine</summary>

- Landmine:
  - Landmine:MineBeep
    - Landmine periodic beep
  - Landmine:MineDetonate
    - Landmine explosion
  - Landmine:MineDetonateDistance
    - Landmine explosion distant
  - Landmine:MineTrigger
    - Landmine pre-explode
  - Landmine:PressLandmine
    - Landmine stepped on

- SmallClick
  - (Unknown!!!)

</details>


<details>
<summary>Turret</summary>

- Audios
  - Gunfire:TurretActivate
    - Power on
  - BerserkAudio:TurretBerserkMode
    - Going crazy after being hit
  - Gunfire:TurretDeactivate
    - Power off
  - Gunfire:TurretFire
    - [Looping] Firing
  - GunfireFar:TurretFireDistance
    - [Looping] Firing far away
  - Gunfire:TurretSeePlayer
    - Who goes there!
  - BulletCollisions:TurretWallHits
    - Bullets ricocheting off walls

</details>


<details>
<summary>Spike Trap</summary>

- SpikeSlamBodyStickyPoint:
  - CrushAudio:CrushGore
    - Player death: Killed by spike trap
  - CrushAudio:ExplodeHeadSecondarySFX
    - Secondary sound after being killed
  
- AnimContainer:
  - SpikeAudio:SpikeRoofSlam
    - Spike trap slam ground
  
- SpikeRoofTrapHazard:
  - CreakingSFX:SpikeRoofTrapCreak
    - [Looping] Warning sound when standing under spike trap

</details>


## Other

The list structure goes as follows:

- [GameObject Name]:[AudioSource Name]:[Sound Name]
  - [Explanation]

------

<details>
<summary>A</summary>

- Cube.005:SpeakerAudio:0DaysLeftAlert
  - Ship speaker alert when 0 days remain
- Audios:UIAudio:AlertHUD
  - Hud alert for "increasing radiation levels" after pulling apparatus
- Audio:Music1:AlleyFactoryAmbiance
  - [Looping] Ambience plays outside main entrance on specific maps
- Audios:UIAudio:AllPlayersDead
  - Stinger when all players have died and the ship is automatically leaving
- Audios:MovementAudio:Aluminum1
- Audios:MovementAudio:Aluminum2
- Audios:MovementAudio:Aluminum3
- Audios:MovementAudio:Aluminum4
  - Player footstep sounds (eg. within ship)
- HighAndLowAltitudeBG:HighAudio:ArtificeDaytimeAmbience
- SoundManager:OutsideMusic:AmbientMusic1
- SoundManager:OutsideMusic:AmbientMusic2
- SoundManager:OutsideMusic:AmbientMusic3
- SoundManager:OutsideMusic:AmbientMusic4
- SoundManager:OutsideMusic:AmbientMusic5
  - Random music stingers while outside
- Audios:DeskAudio:AngerAtDesk
- Audios:DeskAudio:AngerAtDesk2
  - Tentacles at company building getting angry
	
</details>

<details>
<summary>B</summary>
	
- PatcherGunItem:AimDirection:BeginShock1
  - Unknown (Zap gun?)
- BellDinger:Trigger:BellDinger
  - Company selling desk dinger
- (Null):BigDoor:BigDoorClose
- (Null):BigDoor:BigDoorOpen
  - Large security doors in Facility
- Audio:Music1:BigFactoryInside
  - Ambience when outside experimentation
- BigMachine:BigMachineRoom1
  - [Looping] Plays at company building and most maps
- BigMachine:BigMachineRoom3
  - [Looping] Plays at company building
- SoundManager:AmbienceSource:Bird1
- SoundManager:AmbienceSource:Bird2
- SoundManager:AmbienceSource:Bird3
  - Ambient sounds when in forest environment
- BlizzardAmbience:Blizzard
  - [Looping] Snowstorm environment ambience
- Audios:MovementAudio:BloodGore
  - Player death: Killed by other player
- WebHangerPhysics:BodyCollision1
- WebHangerPhysics:BodyCollision2
- WebHangerPhysics:BodyCollision3
  - Placing dead body at Company selling desk
- AnimContainer:Audio:Boombox6QuestionMark
  - [Looping] Discoball
- (Null):InitSceneScript:BootUp
- Canvas:MenuManager:BootUp2
  - Starting game loading screen
- SoundManager:AmbienceSource:BranchSnap1
- SoundManager:AmbienceSource:BranchSnap2
  - Ambient sounds when in forest environment
- (Null):BreakerBox:BreakerBoxClose
  - Sound is inverted; Open
- (Null):BreakerBox:BreakerBoxHum
  - [Looping] Hum when power is on
- (Null):BreakerBox:BreakerBoxOpen
  - Sound is inverted; Close
- (Null):BreakerBox:BreakerLever1
- (Null):BreakerBox:BreakerLever2
- (Null):BreakerBox:BreakerLever3
  - Lever flick sounds
- UnderwaterAudio:BreathingUnderwater
  - Plays constantly when player is underwater
- AnimContainer:BridgeAudio:BridgeCollapseV2
  - Large bridge collapse
- DangerousBridge:Trigger:BridgeCollapse3
  - Adamance small bridge collapse
- DangerousBridge:Trigger:BridgeCreakHeavy2
  - Adamance small bridge creaks
- AnimContainer:BridgeAudio:BridgeCreak1
- AnimContainer:BridgeAudio:BridgeCreak2
- AnimContainer:BridgeAudio:BridgeCreak3
  - Large bridge creaks
- SoundManager:AmbienceSource:BumpOutsideShip1
- SoundManager:AmbienceSource:BumpOutsideShip2
- SoundManager:AmbienceSource:BumpOutsideShip3
- SoundManager:AmbienceSource:BumpOutsideShip4
- SoundManager:AmbienceSource:BumpOutsideShip5
  - Ambience plays in forest / inside
- SoundManager:AmbienceSource:BushRustle1
- SoundManager:AmbienceSource:BushRustle2
  - Ambient sounds when in forest environment
- Audios:MovementAudio:BunnyHop
  - Special jump audio when bunny suit equipped
- PlayerSettingsObject:Button1
  - UI sound - sliders
- Canvas:MenuManager:Button2
  - UI sound - select
- Canvas:MenuManager:Button3
  - UI sound - return
- Canvas:MenuManager:Button4
  - UI sound - confirm
- Canvas:SelectAudio:(Game startup screen) / HangarDoorButtonPanel:Audio:(Ship door button) / ButtonContainer:ButtonAudio:(Ship teleporter buttons)
  - ButtonPress1
  - ButtonPress2
    - Generic button sounds, used by: teleporter button, ship door button, startup screen
	
</details>

<details>
<summary>C</summary>
	
- Audios:WindowAudio:CalmBehindDoor
  - [Looping] Ambient tentacle sound when selling desk door is open
- (Unknown!!!):CalmWater
  - [Looping] Ocean sound at company
- RomanticTableContainer:PlacementCollider:CandleFlame
  - Romantic table candle burning
- Audios:MovementAudio:Carpet1
- Audios:MovementAudio:Carpet2
- Audios:MovementAudio:Carpet3
- Audios:MovementAudio:Carpet4
  - Player footstep sounds
- Audios:MovementAudio:ChangeSuit
  - Player change suit sound
- ChargeStationTrigger:Trigger:ChargeItem
  - Player use recharge station at ship
- SoundManager:AmbienceSource:ChewMeat1
  - Ambient sound when inside
- Audios:MovementAudio:ClimbLadderLoosenGrip
- Audios:MovementAudio:ClimbLadderLoosenGrip2
- Audios:MovementAudio:ClimbLadderLoosenGrip3
- Audios:MovementAudio:ClimbLadderStep2
- Audios:MovementAudio:ClimbLadderStep3
- Audios:MovementAudio:ClimbLadderStep4
  - Moving up/down ladder sounds
- SoundManager:AmbienceSource:Clock1
- SoundManager:AmbienceSource:Clock2
  - Ambient sounds when inside
- TerminalScript:TerminalAudio:CodeBroadcastSound
  - Ship terminal enter code sound
- Audios:UIAudio:CollectScrapSmall
  - HUD alert for scrap deposited in ship
- TimeAndWeather:TimeOfDayCue:CompanyBuildingMusic1
  - Music when entering Company
- Audios:UIAudio:ComputerBeep1
- Audios:UIAudio:ComputerBeep2
- Audios:UIAudio:ComputerBeep3
- Audios:UIAudio:ComputerBeep4
- Audios:UIAudio:ComputerBeep5
- Audios:UIAudio:ComputerBeep6
  - HUD alerts for info messages (eg. ship is leaving in 2 hours)
- Audios:MovementAudio:Concrete1
- Audios:MovementAudio:Concrete2
- Audios:MovementAudio:Concrete3
- Audios:MovementAudio:Concrete4
  - Player footsteps
- Audios:UIAudio:CounterAdd
  - [Looping] Value counter ticking after scanning scrap
- Audios:UIAudio:CounterAddFinish
  - Value counter has finished ticking after scanning scrap
- SoundManager:AmbienceSource:Creak1
- SoundManager:AmbienceSource:Creak10
- SoundManager:AmbienceSource:Creak11
- SoundManager:AmbienceSource:Creak2
- SoundManager:AmbienceSource:Creak3
- SoundManager:AmbienceSource:Creak4
- SoundManager:AmbienceSource:Creak5
- SoundManager:AmbienceSource:Creak6
- SoundManager:AmbienceSource:Creak7
- SoundManager:AmbienceSource:Creak8
- SoundManager:AmbienceSource:Creak9
  - Ambience when inside
- Audios:UIAudio:CriticalInjury
  - HUD alert when critically injured
- StorageCloset:LockerAudio:CupboardClose
- StorageCloset:LockerAudio:CupboardOpen
  - Ship storage cupboard
- Cube.005:SpeakerAudio:CutSpeaker
  - Disable ship speaker
	
</details>

<details>
<summary>D</summary>
	
- Audios:ConstantWallAudio:DangerousMoodAmbience
  - [Looping] Company ambient background
- DarkAmbiance
  - Unused!!!
- Audios:UIAudio:DaysLeftSFX
  - HUD alert after entering orbit and day counter ticking down
- HangarShip:HangarDoorAudioSource:DeadlineAlarm
  - [Looping] Failure to meet quota alarm
- Audios:LevellingAudio:DecreaseLevel
  - [Looping] Player XP level lowering sound
- SoundManager:AmbienceSourceNonDiagetic:DeepBass
  - Ambience when inside
- tree.003_LOD0:CricketAudio:DesertCricket
  - Outside ambience
- Spine.002:BodyAudio:DieFromFallDamageSFX1
  - Player death: Killed by fall damage or ladder
- DocileLocustBees:ConstantSFX:DocileLocustBees
  - [Looping] Roaming locust ambience
- DocileLocustBees:SwarmLeaveSFX:DocileLocustBeesEvade
  - Roaming locust scatter sound
- DoorMesh:DoorSound:DoorClose1
- DoorMesh:DoorSound:DoorClose2
- DoorMesh:DoorSound:DoorOpen1
- DoorMesh:DoorSound:DoorOpen2
  - Inside generic door, Sound is inverted; Close <> Open
- Audios:DeskAudio:
  - Company selling desk door close
- DoorMesh:DoorLockPickSound:DoorUnlock
- DoorMesh:DoorLockPickSound:DoorUnlock2
  - Use key / lockpicker on generic door
- SoundManager:AmbienceSourceNonDiagetic:Droning1
- SoundManager:AmbienceSourceNonDiagetic:Droning2
  - Ambience when inside
	
</details>

<details>
<summary>E</summary>
	
- SoundManager:EarsRingingAudio:EarsRinging
  - Ringing after flashbang/explosion/firing shotgun
- EclipseMusic:EclipseAmbience
  - Outside background ambience when on eclipsed moon
- HighAndLowAltitudeBG:LowAudio:EmbrionAmbience
  - Outside background ambience when on embrion
- TerminalAudio:EnterTerminal
  - Use ship terminal
- TerminalAudio:ExitTerminal
  - Stop using ship terminal
	
</details>

<details>
<summary>F</summary>
	
- Audio:Music1:FactoryWindAmbianceFactoryWindAmbiance
  - [Looping] Ambience outside 
- SoundManager:TempAudio1:FallInWater
  - Player fall in water
  - Whoopie cushion sounds
- Audios:UIAudio:FinalDayBeforeDeadline
  - Hud alert after entering orbit with 1 day left
- FinishCharging
  - Unused
- SoundManager:AmbienceSource:FireAlarm
  - Ambience when inside
- Cube.005:SpeakerAudio:FiredVoiceline
  - Ship speaker alert when failed to meet quota
- (Unkown!!!):Fireplace
  - [Looping] Mansion fireplace
- ForestAmbience:Forest
  - [Looping] Ambience when in forest
	
</details>

<details>
<summary>G</summary>
	
- GarageDoorSlam
- Cutscenes:Cube:GarageDoorSlide1
- Cutscenes:Cube:GarageDoorSlide2
- Cutscenes:Cube:GarageDoorSlide3
  - Movement of gate outside Experimentation main exit
- GarageDoorsContainer:GarageDoorContainer:GarageDoorMove
  - Artifice garage door movement
- GarageDoorsContainer:GarageDoorContainer:GarageDoorShut
  - Artifice garage door start moving
- GarageDoorsContainer:GarageDoorContainer:GarageDoorShut2
  - Artifice garage door stop moving
- SoundManager:AmbienceSourceNonDiagetic:GhostlySynth
- SoundManager:AmbienceSourceNonDiagetic:GhostlySynth2
  - Ambience when inside
- GlassShatter
  - Delete save file
- Audios:UIAudio:GlobalNotificationSFX
  - HUD alert when new creature is discovered
- SoundManager:AmbienceSource:Grass1
- SoundManager:AmbienceSource:Grass2
  - Ambience when outside
- Audios:MovementAudio:Grass1
- Audios:MovementAudio:Grass2
- Audios:MovementAudio:Grass3
- Audios:MovementAudio:Grass4
  - Player footsteps
- Audios:MovementAudio:Gravel1
- Audios:MovementAudio:Gravel1Wet
- Audios:MovementAudio:Gravel2
- Audios:MovementAudio:Gravel2Wet
- Audios:MovementAudio:Gravel3
- Audios:MovementAudio:Gravel3Wet
- Audios:MovementAudio:Gravel4
- Audios:MovementAudio:Gravel4Wet
  - Player footsteps
	
</details>

<details>
<summary>H</summary>
	
- HangarDoorAudioSource:HangarDoorOpen1
  - Ship door open
- HangarShip:HangarDoorAudioSource:HangarDoorOpening
  - Ship door first time opening when arriving at planet
- HangarDoorAudioSource:HangarDoorShut
  - Ship door close
- SoundManager:Heartbeat:Heartbeat1
- SoundManager:Heartbeat:Heartbeat2
- SoundManager:Heartbeat:Heartbeat3
  - [Looping] Player heartbeat sound when in danger
- Audios:UIAudio:HeightDamage
  - Player take fall damage
- HighAction1:HighAction1
- HighAction2:HighAction2
  - [Looping] Player is in danger background sound (explained in trivia section)
- HighAndLowAltitudeBG:HighAudio:HighWind
  - [Looping] Wind when arriving to/leaving a moon (May play elsewhere outside)
- ShovelItem: / StopSign: / YieldSign:
  - HitCarpet
  - HitDirt
  - HitEnemyBody
  - HitGround1
  - HitMetal
  - HitPlayerSFX
  - HitSlime
  - HitWater
  - HitWeb
  - HitWood
    - Hitting different things
- Canvas:SelectAudio:HoverButton1
  - UI button sound
- Audios:UIAudio:HUDSystemAlert
  - HUD alert oxygen low when underwater
	
</details>

<details>
<summary>I</summary>
	
- (Unknown!!!):IcecreamTruckFar
  - [Looping] Dropship music when inside
- (Unknown!!!):IcecreamTruckV2
  - [Looping] Dropship music
- (Unknown!!!):IcecreamTruckV2ChristmasFar
  - [Looping] Dropship music when inside
- (Unknown!!!):IcecreamTruckV2Christmas
  - [Looping] Dropship music
- Audios:LevellingAudio:IncreaseLevel
  - Player XP level increasing sound
- InsertLungDevice
  - Unused
- SoundManager:AmbienceSource:InsideShipCreak1
- SoundManager:AmbienceSource:InsideShipCreak2
  - Ship random sounds
- Cube.005:SpeakerAudio:IntroCompanySpeech
  - Ship speaker alert when starting a new save file
- ItemShipAnimContainer:ItemShip:ItemDropshipLand
  - Dropship hit ground
- ItemShipAnimContainer:ItemShip:ItemDropshipOpenDoors
  - Dropship doors opened
	
</details>

<details>
<summary>J</summary>
	
- PumpkinUnlockableContainer:HitPumpkinTrigger:JackOLanternHit
  - Ship Jack'O'Lantern interact sound
- (Unknown!!!):JetpackBroken
  - Unknown!!!
- Audios:MovementAudio:JumpHitGround1
- Audios:MovementAudio:JumpHitGround2
  - Player hit ground after jumping
	
</details>

<details>
<summary>K</summary>
	
- TerminalScript:TerminalAudio:Key1
- TerminalScript:TerminalAudio:Key2
- TerminalScript:TerminalAudio:Key3
- TerminalScript:TerminalAudio:Key4
- TerminalScript:TerminalAudio:Key5
- TerminalScript:TerminalAudio:Key6
- TerminalScript:TerminalAudio:Key7
- TerminalScript:TerminalAudio:Key8
  - Ship terminal keyboard clicks
	
</details>

<details>
<summary>L</summary>
	
- IndustrialFan:LargeFanRoom
  - [Looping] Facility main entrance room ambience
- TimeAndWeather:TimeOfDayCue:LateDay
  - Outside evening stinger
- (Unknown!!!):LevelDown
  - Player rank-down
- (Unknown!!!):LevelUp
  - Player rank-up
- RomanticTableContainer:PlacementCollider:LightCandle
  - Romantic table light candle
- RomanticTableContainer:PlacementCollider:LightCandleBlow
  - Romantic table blow out candle
- (See [Misc] for GO/AS):LightFlicker
  - Light flicker inside, used by: Little girl demanifest, pulling apparatus
- TelevisionContainer:TVAudio:LightningAudio
  - Ship decor television
- Stormy:StrikeAudio:(strike random location) / Stormy:StrikeAudioB:(strike random location) / Stormy:StrikeAudioTargeted:(strike item on ground/in inventory)
  - LightningStrike1
  - LightningStrike2
  - LightningStrike3
  - LightningStrike4
- LightOff (See [Misc] for GO/AS)
  - Inside lights turn off
- LightOn (See [Misc] for GO/AS)
  - Inside lights turn on
- LockpickPlayer
  - Unused
- SoundManager:AmbienceSource:LoudCreak1
- SoundManager:AmbienceSource:LoudCreak2
- SoundManager:AmbienceSource:LoudCreak3
  - Ambience when inside
- LowAction:LowAction
  - [Looping] Player is in danger background sound (explained in trivia section)
- HighAndLowAltitudeBG:LowAudio:LowerCliffs
  - [Looping] Ambience plays on various maps
- LungApparatus:LungMachine
  - [Looping] Apparatus ambient hum
- MapPropsContainer:LungApparatus:LungMachineDisconnect
  - Apparatus pull from wall
	
</details>

<details>
<summary>M</summary>
	
- Canvas:MenuManager:Menu1
  - [Looping] Main menu music
- SoundManager:AmbienceSource:MetalClank1
  - Ambience when inside
- Teleports:EntranceTeleportA/B/C/D: (A = Main entrance / B,C,D,E... = Fire exit)
  - MetalDoorShut1
  - MetalDoorShut2
    - Use Entrance/Exit
- CompanyPlanet:TrapDoor:(Company Trapdoor) / StorageShelfContainer:storage door:(Facility Storage Locker)
  - MetalHatchClose
- CompanyPlanet:TrapDoor:(Company Trapdoor) / StorageShelfContainer:storage door:(Facility Storage Locker)
  - MetalHatchOpen
- Audios:MovementAudio:MetalWalk
- Audios:MovementAudio:MetalWalk2
- Audios:MovementAudio:MetalWalk3
- Audios:MovementAudio:MetalWalk4
  - Player footsteps
- Audios:SpeakerAudio:
  - Mic1
  - Mic2
  - Mic3
  - Mic4
  - Mic6
  - Mic7
  - Mic8
  - Mic9
  - Mic10
  - Mic11
    - Company selling desk voice
- TimeAndWeather:TimeOfDayCue:MidDay
  - Outside noon stinger
- AnimContainer:PlacementCollider:MoveShipObjectBig
  - Move object successfully
- MoveShipObjectCancel
  - Cancel object movement
- Audios:UIAudio:MoveShipObjectDeny
  - Object cannot be moved
- MoveShipObjectPaper
  - Sigurd sticky note
- Audios:UIAudio:MoveShipObjectStart
  - Begin moving object
- StatusEffectAudio:MoveThroughWater
  - [Looping] Player moving through water
	
</details>

<details>
<summary>N</summary>
	
- Audios:UIAudio:NewProfitQuota
  - HUD alert new profit quota given
- TimeAndWeather:TimeOfDayCue:Night
  - Outside night stinger
	
</details>

<details>
<summary>P</summary>
	
- HangarShip:ClipboardManual:PaperTurn1
- HangarShip:ClipboardManual:PaperTurn2
  - Ship instruction manual page turn
- PhoneTheme3
  - Unused
- SteamValve:PipeBurstBlowingSteam
  - [Looping] Blowing steam
- SteamValve:PipeBurstInitialSound1
  - Begin blowing steam
- SteamValve:PipeCrack1
  - Before blowing a hole
- SteamValve:PipeFlowing1
- SteamValve:PipeFlowing2
  - [Looping] Steam flowing
- SteamValve:PipeValveTwist
  - Twist steam pipe valve
- SoundManager:AmbienceSource:PipeNoise1
- SoundManager:AmbienceSource:PipeNoise2
- SoundManager:AmbienceSource:PipeNoise3
  - Ambient when inside
- WelcomeMatContainer:Cube:PlaceRug
  - Ship decor rug place
- PlushiePJManContainer:
  - TouchTrigger: (Squeeze)
  - PlacementCollider: (Place down)
    - PlushieSqueeze
      - Ship decor plushie (pet him, do it now)
- (Unknown!!!):PowerRoom1
  - Experimentation Unknown!!!
- PullCord:Cube:PullCord
  - Ship loud horn pull cord
- LeverSwitchForDrill:LeverSwitch:PullLever2
  - Company basement light lever
- TerminalScript:TerminalAudio:PurchaseSFX
  - Ship terminal purchase item
	
</details>

<details>
<summary>Q</summary>
	
- SoundManager:AmbienceSourceNonDiagetic:QuietDrum1
  - Ambiencee when inside
	
</details>

<details>
<summary>R</summary>
	
- Radio1
  - Unused
- (Unknown!!!):Rain
  - [Looping] Rain
- SoundManager:AmbienceSource:Random1
- SoundManager:AmbienceSource:Random2
  - Ambience when inside
- Audios:UIAudio:ReachedQuotaSFX
  - HUD alert quota reached
- RecordPlayerContainer:Audio:RecordPlayerJazz
  - [Looping] Ship decor record player music
- RecordPlayerContainer:Audio:RecordScratch1
  - Start record player
- RecordPlayerContainer:Audio:RecordScratch2
  - Pause record player
- DepositCounter:Music:RewardGood
  - Sell scrap at company sell desk (above quota requirement!!!)
- DepositCounter:Music:RewardMid
  - Sell scrap at company sell desk (below quota requirement!!!)
- Audios:MovementAudio:Rock1
- Audios:MovementAudio:Rock2
- Audios:MovementAudio:Rock3
- Audios:MovementAudio:Rock4
- Audios:MovementAudio:Rock5
  - Player footsteps
- SoundManager:AmbienceSource:RockCrumble1
- SoundManager:AmbienceSource:RockCrumble2
- SoundManager:AmbienceSource:RockCrumble3
- SoundManager:AmbienceSource:RockCrumble4
- SoundManager:AmbienceSource:RockCrumble5
  - Ambience when outside on sandy/rocky maps
- SoundManager:AmbienceSource:RockOutsideShip1
- SoundManager:AmbienceSource:RockOutsideShip2
  - Ambience inside ship
	
</details>

<details>
<summary>S</summary>
	
- Audios:UIAudio:Scan
  - Player scan
- SoundManager:AmbienceSource:ScreamOutsideShip1
- SoundManager:AmbienceSource:ScreamOutsideShip2
- SoundManager:AmbienceSource:ScreamOutsideShip3
  - Ambience when outside
- HornMesh:HornAudio:ShipAlarmHornConstant
  - [Looping] Ship loud horn 
- HornMesh:HornAudioDistant:ShipAlarmHornConstantDistant
  - [Looping] Ship far away/inside loud horn
- Audios:Music1:ShipAmbiance1
  - [Looping] Ship hum inside ship
- LampSqueakAudio:ShipAmbianceLightSqueak
  - Random ambience when ship in orbit
- Environment:HangarShip:ShipAmbianceTurbulence1
  - Random ambience when ship in orbit
- Audios:DiageticBackground:ShipArriveAtPlanet
  - Ship "arrives" (loaded) at a different moon
- HangarShip:HangarDoorAudioSource:ShipDoorOpenPressurize
  - Intense wind pressure when ship door opening while arriving at moon
- Ship3dSFX:ShipEngineOutside
  - [Looping] Ship hum outside ship
- Audios:DiageticBackground:ShipFlyToPlanet
  - Ship "set to travel" (loading) to a different moon
- AnimContainer:TeleportAudio:ShipTeleporterBeam / Audios:MovementAudio:ShipTeleporterBeam
  - Target teleported
- Audios:MovementAudio:ShipTeleporterBeamPlayerBody
  - Pre-teleport hum at target
- (Unknown!!!)ShipTeleporterSpark
  - Random while teleporter spooling up
- AnimContainer:TeleportAudio:ShipTeleporterSpin
  - Teleporter spooling up
- AnimContainer:TeleportAudio:ShipTeleporterSpinInverse
  - Teleporter inverse spooling up
- ThrusterAmbientAudio:ShipThrusterAmbiance
  - Ship arriving at planet
- ItemShipAnimContainer:ItemShip:ShipThrusterClose
  - [Looping] Ship thruster active
- ReverbTriggers:ShipBumpSFX:
  - ShipTurbulence1
  - ShipTurbulence2
  - ShipTurbulence3
  - ShipTurbulence4
  - ShipTurbulence5
  - ShipTurbulence6
    - Random ambience when ship moving
- ShotgunItem:GunShootSFX:ShotgunBlast
- ShotgunItem:GunShootSFX:ShotgunBlast2
  - Shotgun fire, used by: player, nutcracker
- ShotgunItem:ShotgunBlastFail
  - Shotgun attempt firing with safety on
- ShotgunItem:ShotgunReload
  - Player reload shotgun
- ShotgunItem:ShotgunSafetyOff
- ShotgunItem:ShotgunSafetyOn
- ShovelItem: / StopSign: / YieldSign:
  - ShovelHitDefault
  - ShovelHitDefault2
    - Always plays when hitting something
  - ShovelReelUp
   - Charge shovel strike
  - ShovelSwing
    - Mid shovel strike
- Shower:ShowerOn
  - [Looping] Ship decord shower
- Audios:UIAudio:SignalTranslatorBegin
  - Translator display appear
- Audios:UIAudio:SignalTranslatorFinish
  - Translator display disappear
- Audios:UIAudio:SignalTranslatorLocalSFX
  - [Looping] While translator active
- Audios:UIAudio:SignalTranslatorType1
- Audios:UIAudio:SignalTranslatorType2
- Audios:UIAudio:SignalTranslatorType3
  - Translator letter appear
- Audios:StatusEffectAudio:SinkIntoMud
  - [Looping] Player sinking into mud
- Blob:SlimeAngry
  - [Looping] Slime aggro on player
- Blob:SlimeDance
  - [Looping] Slime dancing to boombox 
- Blob:SlimeIdle
  - [Looping] Slime no aggro
- Blob:SlimeKillPlayer
  - Player death sound: Killed by slime
- Audios:DeskAudio:SmallHatchDoorOpen
  - Company sell desk door open
- TelevisionContainer:TVAudio:SnareFleaTipChannel
  - Ship decor television
- (Unknown!!!):Snoring
  - [Looping] Company tentacles sleeping
- Audios:MovementAudio:Snow1
- Audios:MovementAudio:Snow2
- Audios:MovementAudio:Snow3
- Audios:MovementAudio:Snow4
  - Player footsteps
- StartGameLever:StartGameLever
  - Pull ship lever
- Audios:MovementAudio:StartJump
  - Player begin jump, used by: player jumping, picking up dead body
- TimeAndWeather:TimeOfDayCue:StartOfDay
  - Outside morning stinger
- Audios:ItemAudio:StickyNote
  - Pickup sigurd sticky note
- (Unknown!!!)Stinger_EnterDefaultMaze
  - Occasionally plays when entering Facility
- (Unknown!!!)Stinger_EnterManor
  - Occasionally plays when entering Mansion
- Stormy:StaticWarningParticle:StormStaticElectricity
  - Item thunder strike buildup warning
- (Unknown!!!):StormyRain
  - [Looping] Rain with thunder
- SoundManager:AmbienceSource:StrangeNoise1
- SoundManager:AmbienceSource:StrangeNoise2
- SoundManager:AmbienceSource:StrangeNoise3
- SoundManager:AmbienceSource:StrangeNoise4
  - Ambience
- Audios:UIAudio:SuckedIntoSpace
  - Ship ejection when failed to meet quota
- SoundManager:AmbienceSource:SuddenStep
- SoundManager:AmbienceSource:SuddenStep2
  - Ambience plays outside
	
</details>

<details>
<summary>T</summary>
	
- Audios:UIAudio:TakeDamage
  - Player take damage
- Audios:DeskAudio:TakeItems1
- Audios:DeskAudio:TakeItems2
- Audios:DeskAudio:TakeItems3
  - Company sell desk retrieve items with hook
- Audios:UnderwaterBubblesAudio:TalkingUnderwaterBubbles
  - [Looping] Player talking while underwater
- Audios:DeskAudio:TentaclesAttack
  - Tentacles attack from company sell desk
- TerminalScript:TerminalAudio:TerminalAlarm
  - Unknown!!!
- TerminalScript:TerminalAudio:TerminalLoadImage
  - Ship terminal loading info on creature
- TerminalScript:TerminalAudio:TerminalTypoError
  - Ship terminal grammar oopsie
Stormy:StrikeAudio: / Stormy:StrikeAudioB:
  - Thunder1
  - Thunder2
  - Thunder3
    - Distant lightning strikes
- (Unknown!!!):thunder_normal_8
  - Ambience when outside 
- Audios:MovementAudio:Tile1
- Audios:MovementAudio:Tile2
- Audios:MovementAudio:Tile3
- Audios:MovementAudio:Tile4
- Audios:MovementAudio:Tile5
  - Player footsteps
- Audios:UIAudio:TipsHUD
- Audios:UIAudio:TipsHUD2
  - HUD alert generic
- Toilet:Cube:ToiletFlush
  - Ship decor
- TelevisionContainer:TVAudio:TurnTVOff
- TelevisionContainer:TVAudio:TurnTVOn
  - Ship decor television
- TelevisionContainer:TVAudio:TVKittenTheme
  - Ship decor television
	
</details>

<details>
<summary>V</summary>
	
- VentEntrance:VentCrawl1
  - [Looping] Monsters crawling through vent
- VentEntrance:VentOpen1
  - Monsters appearing from vent
- SoundManager:AmbienceSource:VoiceCry
- SoundManager:AmbienceSource:VoiceCry2
  - Ambience when inside
- SoundManager:AmbienceSource:VoiceHey
	Ambience when inside
- SoundManager:AmbienceSource:v50MetalCreak1
- SoundManager:AmbienceSource:v50MetalCreak2
- SoundManager:AmbienceSource:v50MetalCreak3
- SoundManager:AmbienceSourceNonDiagetic:v50Scuba1
- SoundManager:AmbienceSourceNonDiagetic:v50Scuba2
  
	
</details>

<details>
<summary>W</summary>
	
- Audios:WallAudio:WallRumble
  - Company tentacle getting angry
- Audios:WallAudio:WallRumbleVoice
  - Company tentacle getting very angry
- Audios:UIAudio:WarningHUD
- Audios:UIAudio:WarningHUD2
- Audios:UIAudio:WarningHUD3
  - HUD alert generic warning
- WaterAmbience
  - [Looping] Water outside on moons
- SoundManager:AmbienceSource:Whistle
  - Ambience when inside
- Audio:Music1:WindOutside
  - [Looping] Ambience outside ship
- SoundManager:AmbienceSource:WindOutsideShip1
- SoundManager:AmbienceSource:WindOutsideShip2
- SoundManager:AmbienceSource:WindOutsideShip3
  - Random ambience inside ship
- Audios:MovementAudio:WoodB1
- Audios:MovementAudio:WoodB2
- Audios:MovementAudio:WoodB3
- Audios:MovementAudio:WoodB4
- Audios:MovementAudio:WoodB5
- Audios:MovementAudio:WoodB6
- Audios:MovementAudio:WoodB7
  - Player footsteps
- SoundManager:AmbienceSource:WoodCreak1
- SoundManager:AmbienceSource:WoodCreak2
- SoundManager:AmbienceSource:WoodCreak3
- SoundManager:AmbienceSource:WoodCreak4
- SoundManager:AmbienceSource:WoodCreak5
- SoundManager:AmbienceSource:WoodCreak6
- SoundManager:AmbienceSource:WoodCreak7
  - Ambience inside Mansion
- Audios:MovementAudio:WoodStep1
- Audios:MovementAudio:WoodStep2
- Audios:MovementAudio:WoodStep3
- Audios:MovementAudio:WoodStep4
  - Player footsteps

</details>

## Other mods

<details>
<summary>Diversity - 2.1.0</summary>

***Diversity changes Bracken's 'AngerVoice:Angered' to 'AngerVoiceAudio:Angered'***

Ambience & Misc:

- AmbienceAudio:ambience
  - Bracken personal space
- Sound:steam
- Sound:lightbuzz
- Sound:lighton
- OneShotSound:heartbeat


Bracken:

- OneShotSound:brakenScream
  - Global scream after removing apparatus from socket
- Target:you're next
  - Voice line played in walkie-talkie when Bracken kills the player who removed the apparatus


Dress Girl:

- Target:voice_Insert 1
- Target:voice_Insert 2
- Target:voice_Insert 3
- Target:voice_Insert 4
- Target:voice_Insert 5
- Target:voice_Insert 6
- Target:voice_Insert 7
- Target:voice_Insert 8
- Target:voice_Insert 9
- Target:voice_Insert 10
- Target:voice_Insert 11
- Target:voice_Insert 12
- Target:voice_Insert 14
- Target:voice_Insert 15
- Target:voice_Insert 16
- Target:voice_Insert 17
- Target:voice_Insert 18
  - Dress Girl voice over Radio

- Sound:voice_Insert 1
- Sound:voice_Insert 2
- Sound:voice_Insert 3
- Sound:voice_Insert 4
- Sound:voice_Insert 5
- Sound:voice_Insert 6
- Sound:voice_Insert 7
- Sound:voice_Insert 8
- Sound:voice_Insert 9
- Sound:voice_Insert 10
- Sound:voice_Insert 11
- Sound:voice_Insert 12
- Sound:voice_Insert 14
- Sound:voice_Insert 15
- Sound:voice_Insert 16
- Sound:voice_Insert 17
- Sound:voice_Insert 18
  - Dress Girl voice normal

Walker:

- Sound:DoorSlam1
- Sound:DoorSlam2
  - Walker kick down doors
- Sound:step1
- Sound:step2
- Sound:step3
- Sound:step4
- Walker:glitch:glitch
  - [Looping] Walker is nearby and being looked at

Walker's stairs:

- stairs:MainSource:main
  - [Looping] Main ambience
- stairs:LowSource:low1
  - [Looping] Low intensity ambience
- stairs:MidSource:mid1
- stairs:MidSource:mid2
- stairs:MidSource:mid3
  - [Looping] Mid intensity ambience
- stairs:HighSource:high1
  - [Looping] High intensity ambience
- stairs:ShortSource:short1
- stairs:ShortSource:short2
- stairs:ShortSource:short3
  - Short/quick ambience
- stairs:RumbleSource:Rumble1
- stairs:RumbleSource:Rumble2
  - Rumble SFX

Speaker:

- Cube.005:SpeakerAudio:Welcome_1
- Cube.005:SpeakerAudio:Welcome_2
- Cube.005:SpeakerAudio:Terminal_Error_With_Laugh
- Cube.005:SpeakerAudio:Terminal_Error_No_Laugh
- Cube.005:SpeakerAudio:Terminal_Error_2
- Sound:Dog_Spawn_Or_When_Close_to_Ship
- Sound:Attempt_To_Shut_Off_Speaker
- Sound:Turning_Off_Speaker_2
- Cube.005:SpeakerAudio:Eject_1
- Cube.005:SpeakerAudio:Eject_2
- Cube.005:SpeakerAudio:Loading_Back_In_After_An_Eject
- Cube.005:SpeakerAudio:Return_From_Eject_2
- Cube.005:SpeakerAudio:0_Days_Left
- Cube.005:SpeakerAudio:0_Days_Left_2
- Cube.005:SpeakerAudio:Reaching_Quota
- Cube.005:SpeakerAudio:Reaching_Quota_2
- Cube.005:SpeakerAudio:Reaching_Quota_Again
- Cube.005:SpeakerAudio:Reaching_Quota_Again_2

Watcher: 

Sound:banging1
Sound:banging2
Sound:blood splat1
Sound:blood splat2
Sound:blood splat3
Watcher:Breathing:breathing
Sound:get_hurt_1
Sound:get_hurt_2
Sound:get_hurt_4
Sound:slam1
Sound:slam2
Sound:slam3
Watcher:Sound:stab
Sound:vent
Sound:vent2
Sound:vent3
Sound:WatcehrScreech
Sound:WatcherScream

Provided by IntegrityChaos <1093317421714116750>

</details>

<details>
<summary>Facility Meltdown - 2.4.7</summary>


During Meltdown:
- WarningAnnouncerHandler:warning1
- WarningAnnouncerHandler:warning2
- WarningAnnouncerHandler:warning3
- WarningAnnouncerHandler:warning4
  - Responsible for warning voice that plays randomly through the meltdown.
- MeltdownHandler:music
  - Meltdown music
- Shockwave:shockwave
  - Sound is played when player is hit by shockwave (im like 5% sure this works lol)
- FacilityExplosion:final explosion
  - Played when the fireball appears

Items:
- GeigerCounterItem:low radiation
- GeigerCounterItem:medium radiation
- GeigerCounterItem:high radiation
  - These are all looping audio sources and their volume is changed dynamically based on the radiation nearby.

</details>

<details>
<summary>Needy Cats - 1.2.1</summary>

- (Null)
  - ItemAudio:
    - Cat_Pickup
  - Cat:
    - Cat_Drop
    - Cat_CalmDown
      - Pet cat
    - Cat_Meow1
    - Cat_Meow2
    - Cat_Meow3
      - Random calm sounds
    - Cat_Flee1
    - Cat_Flee2
    - Cat_Flee3
      - Cat run when attacked by enemy	
  - CatFood:
    - CatFoodRemoveLid2
    - DropPlastic1
    - ShovelPickUp

</details>

<details>
<summary>Mimics - 2.4.1</summary>

- MimicDoor:
  - growlSFX:growlSFX
    - Hit door with shovel
  - doorSFX:doorSFX
    - Door sound when attacking

- Root:
  - mimicSFX:mimicSFX
    - Sound when attacking
	
***doorSFX and mimicSFX play at the same time when Mimic is attacking, time your audio manually to sync with animation***

doorSFX
- Door fly open: 0ms
- Door slam shut: 3500ms

mimicSFX
- Initial scream: 0ms
- Kill player: 500ms
- Close mouth (first time) after killing player: 860ms
- Close mouth (second time) after killing player: 1200ms
- Close mouth (third time) after killing player: 1800ms
- Scream before sliding back down tunnel: 2300ms

</details>

<details>
<summary>Rolling Giant - 2.5.2</summary>

- PlayerRagdollRollingGiant Variant:
  - ExplodeHeadSFX:KillPlayerSpring
    - Killed by Rolling Giant
  - ExplodeHeadSFX2:ExplodeHeadSecondarySFX
    - Secondary sound after being killed

- RollingGiant:
  - RollingSFX:MovingLoop
    - [Looping] Constant rolling sound
  - VoiceSFX:Stopped1
  - VoiceSFX:Stopped2
  - VoiceSFX:Stopped3
  - VoiceSFX:Stopped4
  - VoiceSFX:Stopped5

</details>

<details>
<summary>LC Office - 1.1.17</summary>

- StartRoomElevator:
  - ElevatorSound:ElevatorOpen
  - ElevatorSound:ElevatorClose
    - Elevator gate sounds
  - ElevatorSound:ElevatorUp
  - ElevatorSound:ElevatorDown
    - Elevator movement sounds
  - ElevatorMusic:saferoom_refiltered
  - ElevatorMusic:shop_refiltered
  - ElevatorMusic:bossa_lullaby_refiltered
    - [Looping] Elevator music
   
- ElevatorPanel:
  - Audio:ButtonPress1_0

- HaltContainer:
  - Halt1Object:HaltAmbient
  - Halt2Object:HaltAmbient
  
- (Null)
  - HaltMusic:HaltMusic
  - HaltMusic:HaltNoise1
  - HaltMusic:HaltNoise2
  - HaltMusic:HaltNoise3
  - HaltMusic:HaltNoise4
  - HaltMusic:HaltAttack

- Audios:
  - ShrimpAngerAudio:DogSprint
    - Shrimp chasing player sound (!!!)
  - ShrimpMainAudio:DogHowl
    - Shrimp spotted player (!!!)
  - ShrimpGrowlAudio:StomachGrowl
  - ShrimpGrowlAudio:BigGrowl
    - Shrimp getting angry at player 
  - ShrimpGrowlAudio:DogRage
    - (!!!)
  - ShrimpMainAudio:Footstep1
  - ShrimpMainAudio:Footstep2
  - ShrimpMainAudio:Footstep3
  - ShrimpMainAudio:Footstep4
    - Footsteps

- DoorMesh:
  - DoorSound:DoorClose
  - DoorSound:DoorOpen
    - Sliding door sounds

</details>

<details>
<summary>Lethal Things - 0.9.4</summary>

***Does not include everything(!!!)***

- Boomba:
  - Idle:motor_whine
    - [Looping] Constant active sound
- (Null)
  - Boomba:MineBeep
    - Periodic beep
  - Boomba:MineDetonate
    - Explosion
  - Boomba:MineTrigger
    - Pre-explode
  - Boomba:PressLandmine
    - Stepped on

- (Null)
  - TeleporterTrap:PressLandmine
    - Stepped on
  - TeleporterTrap:ShipTeleporterBeam
    - Target teleported
- TeleporterTrap:
  - Idle:motor_whine
    - [Looping] Constant active sound
  
- Dingus: ((Maxwell))
  - Music:creatura_music
    - [Looping] weebl Stockmarket 
  - FarAudio:riff
    - Bad to the bone riff when picking up "fake" Maxwell
  - Purr:purr
    - [Looping] Maxwell purring
  - FarAudio:meow_far-01
  - FarAudio:meow_far-02
  - FarAudio:meow_far-03
- Music:
  - MusicFar:creatura_music_far
    - [Looping] weebl Stockmarket but far away
- (Null)
  - Dingus:meow1
  - Dingus:meow2
  - Dingus:meow3

- CookieFumo:
  - FarAudio:bingle
  - FarAudio:buwah
  - FarAudio:fish
  - FarAudio:fitness
  - FarAudio:glock
  - FarAudio:gram
  - FarAudio:head
  - FarAudio:homeless
  - FarAudio:hoo
  - FarAudio:jfk
  - FarAudio:snez
  - FarAudio:typing
  - FarAudio:penny
  - FarAudio:weh
  - FarAudio:princess
    - Squeeze
  - FarAudio:cookiescreamsanddies
    - Throw
  - FarAudio:munch
    - occasionally plays when landing from a throw
- (Null)
  - CookieFumo:bingle
  - CookieFumo:buwah
  - CookieFumo:fish
  - CookieFumo:fitness
  - CookieFumo:glock
  - CookieFumo:gram
  - CookieFumo:head
  - CookieFumo:homeless
  - CookieFumo:hoo
  - CookieFumo:jfk
  - CookieFumo:snez
  - CookieFumo:typing
  - CookieFumo:penny
  - CookieFumo:weh
  - CookieFumo:princess
    - Squeeze
  - CookieFumo:cookiescreamsanddies
    - Throw
  - CookieFumo:munch
    - occasionally plays when landing from a throw


- (Null)
  - ItemAudio:GrabShovel
  - ToyHammer:ShovelReelUp
  - ToyHammer:ShovelSwing
  - ToyHammer:HitMetal
  - ToyHammer:HitDirt
  - ToyHammer:ToyHammerHit1
  - ToyHammer:ToyHammerHit2
  - ToyHammer:ToyHammerHit6
  - ToyHammer:ToyHammerHit4
  - ToyHammer:ToyHammerHit5
  - ToyHammer:DropShovel
  - RocketLauncher:rocket_fire
    - Rocket launcher fire
  - MissilePrefab:rocket_travel
    - [Looping] Rocket launcher missile travel sound
  - RocketLauncher:DropMetalObject2
  - GremlinEnergy:Minecraft Drinking Sound Effect
  - GremlinEnergy:DropMetalObject1

- PingTool:
  - FarAudio:pinger_on
  - FarAudio:ping
- (Null)
  - PingTool:ping
  - PingTool:pinger_on
  - PingTool:DropMetalObject2

- ExplosionEffect:
  - Audio:MineDetonate
    - Rocket launcher missile explosion


- (Null)
  - Flaregun:fire
    - Shoot flare
  - FlareProjectile:flareburn
    - [Looping] Flare burning
  - FlareProjectile:whistle
    - Flare whistle after being shot
  - Flaregun:NoAmmo
    - No ammo left click
  - Flaregun:DropMetalObject2
    - Drop flaregun
  - FlaregunAmmo:DropMetalObject2
    - Drop flaregun ammo

- Dart:hit
  - Dart hit something

</details>

<details>
<summary>Herobrine - 1.3.1</summary>

- (Null)
  - FireAgent:fire
    - Fire burning sound
- FireAgent:
  - Trigger:hit1
  - Trigger:hit2
  - Trigger:hit3
    - Fire burn player

- (Null)
  - Herobrine:mcwhispers
  - Herobrine:gravel2
    - "Gravel" Walking sound (Outside)
  - Herobrine:stone1
  - Herobrine:stone2
  - Herobrine:stone3
  - Herobrine:stone4
  - Herobrine:stone5
  - Herobrine:stone6
    - "Stone" Walking sound (Inside and in ship)

- WarpEffectEnemy:
  - WarpAudio:mc_warp
    - Herobrine teleport / Herobrine teleport player

- MCRagdollPrefab:
  - DeathAudio:steve_death_1
    - Herobrine kill player

- Model:
  - AudioSFX:cave10
  - AudioSFX:cave11
  - AudioSFX:cave12
  - AudioSFX:cave13
  - AudioSFX:cave15
  - AudioSFX:cave16
  - AudioSFX:cave18
  - AudioSFX:cave19
  - AudioSFX:cave2
  - AudioSFX:cave3
  - AudioSFX:cave8
  - AudioSFX:cave9
  - AudioSFX:voices2
  - AudioSFX:voices3
  - AudioSFX:voices4
  - AudioSFX:voices5
    - Player spotted herobrine
  - AudioSFX:halloween-impact
    - Rare jumpscare when spotting herobrine

- (Null)
  - RedstoneTorch:pop
    - Pickup torch
  - RedstoneTorch:wood4
    - Drop Torch

</details>

<details>
<summary>Pool Rooms - 1.1.18</summary>

- Door:
  - DoorSound:slideDoorMove
    - Inside sliding doors

- (Null)
  - LifeBuoy:DropPlasticLarge
  - PoolBall:DropCardboardBox
  - PoolNet:GrabCardboardBox
  - PoolNet:DropPlastic2
  - WetFloorSign:DropPlasticLarge
  
- Player:
  - WaterBehavior:MoveThroughWater
    - Player enter pool water
- WaterBehavior:
  - SplashSound:splash1
  - SplashSound:splash2
    - Footsteps while in pool water

</details>

<details>
<summary>Peepers - 0.9.6</summary>

- PeeperPrefab:
  - AttachSFX:PeeperAttach_Foley_SFX
    - Attach to player
  - FoostepSFX:runSFX
    - Running towards player
  - FoostepSFX:walkSFX
    - Passive movement
  - VoiceSFX:PeeperAlert_5_SFX
  - VoiceSFX:PeeperAlert_6_SFX
  - VoiceSFX:PeeperAlert_7_SFX
  - VoiceSFX:PeeperAlert_8_SFX
  - VoiceSFX:PeeperAlert_9_SFX
    - Spotted player
  - VoiceSFX:PeeperDie_1_SFX
  - VoiceSFX:PeeperDie_2_SFX
  - VoiceSFX:PeeperDie_3_SFX
  - VoiceSFX:PeeperDie_4_SFX
  - VoiceSFX:PeeperDie_6_SFX
    - Death sound
  - VoiceSFX:PeeperEject_2_SFX
  - VoiceSFX:PeeperEject_3_SFX
  - VoiceSFX:PeeperEject_4_SFX
  - VoiceSFX:PeeperEject_5_SFX
  - VoiceSFX:PeeperEject_6_SFX
  - VoiceSFX:PeeperEject_7_SFX
  - VoiceSFX:PeeperEject_8_SFX
  - VoiceSFX:PeeperEject_9_SFX
  - VoiceSFX:PeeperEject_11_SFX
  - VoiceSFX:PeeperEject_12_SFX
    - Detach from player
  - VoiceSFX:PeeperJumping_1_SFX
  - VoiceSFX:PeeperJumping_2_SFX
  - VoiceSFX:PeeperJumping_3_SFX
  - VoiceSFX:PeeperJumping_4_SFX
  - VoiceSFX:PeeperJumping_5_SFX
  - VoiceSFX:PeeperJumping_6_SFX
  - VoiceSFX:PeeperJumping_8_SFX
  - VoiceSFX:PeeperJumping_10_SFX
    - Jump towards player

</details>

<details>
<summary>Haunted Harpist - 1.2.9</summary>

- (Null)
  - Harp:HarpMusic1
  - Harp:HarpMusic2
  - Harp:HarpMusic3
    - [Looping] Used by harp ghost and harp scrap
  - ItemAudio:HarpPickupNoise
    - Pick up harp

- HarpGhost:
  - CreatureVoice:damage1
  - CreatureVoice:damage2
  - CreatureVoice:damage3
    - Ghost take damage
  - CreatureVoice:die3
    - Ghost die
  - CreatureVoice:laugh1
  - CreatureVoice:laugh2
  - CreatureVoice:laugh3
    - Ghost hit player
  - CreatureVoice:random_upset1
  - CreatureVoice:random_upset2
  - CreatureVoice:random_upset3
    - Ghost angered from excess loud noises

</details>

<details>
<summary>Football - 1.1.2</summary>

- (Null)
  - FootballPref:plok
    - New prompt begin ding
  - FootballPref:rightanswer
    - Correct response ding
  - FootballPref:wrong
    - Incorrect response ding
  - FootballPref:squeaky-toy_1
  - FootballPref:squeaky-toy_2
  - FootballPref:squeaky-toy_3
  - FootballPref:squeaky-toy_4
  - FootballPref:squeaky-toy_5
  - FootballPref:squeaky-toy_6
    - Footsteps

- FootballPref:
  - AudioVoice:action-crouch
  - AudioVoice:action-dance
  - AudioVoice:action-dont_move
  - AudioVoice:action-dont_speak
  - AudioVoice:action-dont_stop_moving_1
  - AudioVoice:action-dont_stop_moving_2
  - AudioVoice:action-hit_player
  - AudioVoice:action-jump
  - AudioVoice:action-kill_player
  - AudioVoice:action-look_up
  - AudioVoice:action-point
  - AudioVoice:action-pull_lever
  - AudioVoice:action-spin
    - Prompt voicelines
  - AudioVoice:end_l-01
  - AudioVoice:end_l-02
  - AudioVoice:end_l-03
    - Finished simon says voicelines
  - AudioVoice:end_w-01
  - AudioVoice:end_w-02
  - AudioVoice:end_w-03
  - AudioVoice:end_w-04
    - Failed simon says voicelines
  - AudioVoice:fake-01
  - AudioVoice:fake-02
  - AudioVoice:fake-03
  - AudioVoice:fake-04
  - AudioVoice:fake-05
    - Not simon says voicelines
  - AudioVoice:giggle-01
  - AudioVoice:giggle-02
  - AudioVoice:giggle-03
  - AudioVoice:giggle-04
  - AudioVoice:giggle-05
    - Short laugh when manifesting / before demanifesting 
  - AudioVoice:intro-01
  - AudioVoice:intro-02
  - AudioVoice:intro-03
  - AudioVoice:intro-04
  - AudioVoice:intro-05
    - Simon says voicelines
  - AudioVoice:start-01
    - First time playing simon says (Let's play a game of simon says!)
  - AudioVoice:start-02
    - Countdown to beginning simon says (Are you ready? Get set. Go!)

- FootballPref:
  - PlayerFollower:Shirobon - Opia_loop
  - PlayerFollower:Shirobon - On The Run_loop
  - PlayerFollower:Shirobon - Shibuya_loop
  - PlayerFollower:Shirobon - This Love_loop
  - PlayerFollower:Shirobon - Fight For You_loop
  - PlayerFollower:Shirobon - Pure_loop
  - PlayerFollower:Shirobon - My First LSDJ_loop
  - PlayerFollower:Shirobon - Chiptuna_loop
  - PlayerFollower:FLIPPENDO - Love Is Insecurable REMIX_loop
  - PlayerFollower:KENTENSHI - paranoia_loop
  - PlayerFollower:Lunar Synthetic - Vex_loop
  - PlayerFollower:Kittenji - LSDJ Shop_loop
  - PlayerFollower:Lethal Company - Jester Song
    - [Looping] "Dont stop moving" Prompt music

- PlayerRagdollHeadBurst Variant:
  - ExplodeHeadSFX2:ExplodeHeadSecondarySFX
    - Secondary sound after being killed
  - ExplodeHeadSFX:ExplodeHead
    - Player death: Killed by Football (Also used by Little Girl)

</details>

<details>
<summary>MoreInteriors - 2.5.0</summary>

- SM_Bld_Bunker_Wall_Curved_End_Concrete_Door_x2_01:SM_Bld_Bunker_Wall_Curved_End_Concrete_Door_01:DoorOpen2
- SM_Bld_Bunker_Wall_Curved_End_Concrete_Door_x2_01:SM_Bld_Bunker_Wall_Curved_End_Concrete_Door_01:DoorClose2
  - Large bunker doors

</details>

<details>
<summary>Monster Plushies - 1.2.9</summary>

- (Null):
  - ItemAudio:Squeaky Toy Sound Effect (320 kbps)
  - ItemAudio:Bracken pick up
  - BrackenPlush:Bracken drop
  - BrackenPlush:Brackensqueeze1
  - BrackenPlush:Brackensqueeze1FAR
  - BrackenPlush:Brackensqueeze2
  - BrackenPlush:Brackensqueeze2FAR
  - Bunkspidplush:Squeaky Toy Sound Effect (320 kbps)
  - Bunkspidplush:spider squeeze1
  - Bunkspidplush:spider squeeze1FAR
  - Bunkspidplush:spider squeeze3
  - Bunkspidplush:spider squeeze3FAR
  - Bunkspidplush:spider squeeze4
  - Bunkspidplush:spider squeeze4FAR
  - ItemAudio:Coil head pick up 1
  - CoilHeadPlush:Coil head drop 1
  - CoilHeadPlush:coil1
  - CoilHeadPlush:coil1FAR
  - CoilHeadPlush:coil2
  - CoilHeadPlush:coil2FAR
  - CoilHeadPlush:coil3
  - CoilHeadPlush:coil3FAR
  - EyelessDog:Eyedog squeeze
  - EyelessDog:Eyedog squeezeFAR
  - EyelessDog:Squeaky Toy Sound Effect (320 kbps)
  - ForestPlushie:GiantSqueeze
  - ForestPlushie:GiantSqueezeFAR
  - ForestPlushie:Squeaky Toy Sound Effect (320 kbps)
  - ItemAudio:jesterpickup
  - JesterPlushie:jesterdrop
  - JesterPlushie:jesterinspect
    - Recommended sound length: 4 seconds
  - JesterPlushie:jesterinspectFAR
    - Recommended sound length: 4 seconds
  - Lootbugplush:Squeaky Toy Sound Effect (320 kbps)
  - Lootbugplush:Yipeebugsqueeze
  - Lootbugplush:YipeebugsqueezeFar
  - NutCracker:Nut cracker squeeze
  - NutCracker:Nut cracker squeezeFAR
  - NutCracker:Squeaky Toy Sound Effect (320 kbps)
  - Thumper:Squeaky Toy Sound Effect (320 kbps)
  - Thumper:Thumper squeeze
  - Thumper:Thumper squeezeFAR
  - ComedyPlush:Squeaky Toy Sound Effect (320 kbps)
  - ItemAudio:Comedy pick up
  - ComedyPlush:Comedy Squeeze1
  - ComedyPlush:Comedy Squeeze1FAR
  - ComedyPlush:Comedy Squeeze2
  - ComedyPlush:Comedy Squeeze2FAR
  - ComedyPlush:Comedy Squeeze3
  - ComedyPlush:Comedy Squeeze3FAR
  - ItemAudio:Tragedy pick up
  - TragedyPlush:Squeaky Toy Sound Effect (320 kbps)
  - TragedyPlush:Tragedy squeeze1
  - TragedyPlush:Tragedy squeeze1FAR
  - TragedyPlush:Tragedy squeeze2
  - TragedyPlush:Tragedy squeeze2FAR
  - TragedyPlush:Tragedy squeeze3
  - TragedyPlush:Tragedy squeeze3FAR
  - TragedyPlush:Tragedy squeeze4
  - TragedyPlush:Tragedy squeeze4FAR

</details>

<details>
<summary>The Giant Specimens - 2.1.1</summary>

- PinkGiant1: (Redwood)
  - CreatureSFX:ClosePinkGiantStomp1
  - CreatureSFX:ClosePinkGiantStomp2
  - CreatureSFX:ClosePinkGiantStomp3
  - CreatureSFX:PinkGiantMoroxideStep
    - Footsteps
  - CreatureSFX:CrunchySquish
    - Step on player
  - CreatureSFX:PinkGiantSpawning
    - Spawning in
  - CreatureVoice:ForestKeeperScream
    - Pick up other creature
  - CreatureVoice:RedwoodGiantRoar
    - Spawning in

- MouthBone: (Driftwood)
  - CreatureVoice:Crispy_Stompies
  - CreatureVoice:Crispy_stompie_Variant_2
  - CreatureVoice:Crispy_stompie_Variant_3
    - Chasing player footsteps
  - CreatureVoice:DWDie
    - Killed
  - CreatureVoice:DWScream
    - Scream when spotted player
  - CreatureVoice:DWSpawn
    - Spawning in
  - CreatureVoice:Giant_Gets_His_Wood_Hit_Variant_1
  - CreatureVoice:Giant_Gets_His_Wood_Hit_Variant_2
  - CreatureVoice:Giant_Gets_His_Wood_Hit_Variant_3
    - Take damage
  - CreatureVoice:Walkie_stompie_Variant2
  - CreatureVoice:Walkie_stompie_Variant3
  - CreatureVoice:walkie_Stompie
    - Calm footsteps

</details>

<details>
<summary>Locker - 1.1.2</summary>

- (Null):
  - Locker:locker-activate
    - Activation when touched, scanned, or near electrical equipment
  - Locker:locker-ping
    - Dinger when activated
  - Locker:locker-chasing
    - Moving towards player
  - Locker:locker-reactivate
    - Turn to chase player again after pausing
  - Locker:locker-consume
    - Player death: Killed by Locker
  - Locker:locker-reset
    - Stop chasing player

</details>

<details>
<summary>Gnomes - 2.1.15</summary>

- GnomeEnemyPrefab:
  - CreatureSFX:Gnome Laugh
    - Gnome local sound when gnome touches player

- BlueGnomeEnemyPrefab:
  - CreatureSFX:Gnome Laugh
    - Gnome local sound when gnome touches player

- (Null):
  - GnomeItemPrefab:Gnome Laugh
    - Occasional sound item makes
  - VentEntrance:Gnome Laugh
    - Exiting vent sound
  
- Audios:
  - MovementAudio:Gnome Laugh
    - Player local sound when player touched by gnome

</details>

<details>
<summary>Oxygen - 1.5.5</summary>
  
- Audios:
  - OxygenDefault:Inhale_1
  - OxygenDefault:Inhale_2
    - Calm inhales
  - OxygenDefault:heavy_Inhale_1
    - Out of breath/Stressed inhales
  
- ScavengerModelSuitParts:
  - OxyCharger:OxyChargeSFX2
    - Refill oxygen from ship canister

- Oxy99:
  - ItemGasSFX:HoldTZP
  - ItemGasSFX:CanEmpty
    - OxyBoost empty
  - LocalHelmetSFX:ReleaseHelmetGas
    - Use OxyBoost

</details>