# SkyChunksAndSkyIslands
SkyChunks Plugin for Minecraft, intended to be used with Paper Server.


This is a plugin simulating what TapL might have done in this video:  https://www.youtube.com/watch?v=nZOCHHch140&ab_channel=TapL

Plugin to remove 99% of chunks.

Heres an example of SkyIslands:  https://i.imgur.com/doH6LIX.png

Heres an example of SkyChunks: https://i.imgur.com/MXqzs7m.png

This plugin NEEDS to be used with Paper Server, because its very CPU consuming and Paper got a lot of performance improvements, so it can handle pretty well.

I tested it with Spigot Server and it kinda had a worse time than Paper, even crashed. Even Paper can also crash, if it does, just try again, or you can try to let the server use more RAM through a .bat file with this command:

java -Xmx4096M -Xms4096M -jar paper-1.16.4.jar

Just create a txt file and rename it with start.bat for example, and set the amount of RAM you think its good. On the command above i set 4096 mb. I tested it with 1024 mb and it can run, but sometimes can crash or give OutOfMemory exception. After creating the .bat, just execute it and the server will start.

You should need a good CPU also, but i think thats not a must. Just wait and it shall do it. The first run is the worst, then after that new chunk loading is not that high. Wait a little to join the server. After "done" message, wait until your fans calm down lol

After you join the server, go into creative mode and set yourself a spawning point with commands as /setspawn or /setworldspawn in a chunk with a tree ( i think thats the only thing necessary to progress in minecraft lol).

After this, you need to place the End Portal Frame at the Stronghold because its very likely it will not exist, due to 99% deletion probability. Just find the stronghold using eye of ender and then place the frames. I also couldn't find a way to not delete it through code. I think TapL may have done something like this on his server.

This plugin doesn't delete chunks in the End, because i thought that would be a little too much, the End is already a bunch of islands anyway. And also, would be almost impossible to find an Elytra.

Obs: Its not deleting an actual chunk. I wasn't being able to delete an exact chunk, so i deleted less than a chunk many times, but the result is almost the same. Although if i deleted an exact chunk i could save the End Frame chunk.

If somehow you have trouble using the plugin, you can try to download an example map and use as it is, or use as a base to let the plugin delete the chunks that will come. I already set the portal frame at the stronghold.

Example Map: https://drive.google.com/file/d/1CgG0FpF5KP7nATjMCwIfGkzzCjMVAK__/view?usp=sharing

There should be a fortress in -270, -200.
