# SkyChunksAndSkyIslands
SkyChunks Plugin for Minecraft, intended to be used with Paper Server.

UPDATE: Now it works with 1.18 and up, and it no longer consumes a lot of CPU, because i changed the approach. Instead of relying on a chunk listener, we now change how the terrain generates, which is much more reliable, faster, doesn't show any errors, and doesn't crash. But this introduces other challenges, such as not being able to control structure generation (there's no method to override, in order to change structure generation behaviour).

This is a plugin simulating what TapL might have done in this video:  https://www.youtube.com/watch?v=nZOCHHch140&ab_channel=TapL

Plugin to remove 99% of chunks.

Heres an example of SkyIslands:  https://i.imgur.com/doH6LIX.png

Heres an example of SkyChunks: https://i.imgur.com/MXqzs7m.png

Heres an example of VoidIsLava: https://i.imgur.com/ReGWLmq.png

In case you have any problems, you can try to let the server use more RAM through a .bat file with this command:

java -Xmx4096M -Xms4096M -jar paper-1.16.4.jar

After you join the server, go into creative mode and set yourself a spawning point with commands as /setspawn or /setworldspawn in a chunk with a tree ( i think thats the only thing necessary to progress in minecraft lol).

After this, you need to place the End Portal Frame at the Stronghold. I think TapL may have done something like this on his server.

This plugin doesn't delete chunks in the End, because i thought that would be a little too much, the End is already a bunch of islands anyway. And also, would be almost impossible to find an Elytra.

If somehow you have trouble using the plugin, you can try to download an example map and use as it is, or use as a base to let the plugin delete the chunks that will come. I already set the portal frame at the stronghold.

Example Map: https://drive.google.com/file/d/1CgG0FpF5KP7nATjMCwIfGkzzCjMVAK__/view?usp=sharing

There should be a fortress in -270, -200.

UPDATE: I added a new plugin called VoidIsLava. I decided to add in this same repository because it suits the topic.
Basically, VoidIsLava is the same as SkyChunks but with lava instead of void. The void still exists, the lava is generated at y = 1 and y = 0, so below that is the normal void. Also, at those coordinates it wont generate obsidian nor cobblestone, the water also wont flow (spread). I did this so it can be more interesting, given the fact that anyone could easily create an obsidian bridge with only one water bucket.
