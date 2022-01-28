package wks.wolfkidsounds.wildplants.utils;

import net.minecraftforge.fml.loading.FMLPaths;
import wks.wolfkidsounds.wildplants.Wildplants;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static void createFolders() {
        Path wildplantsConfigurationPath = Paths.get(FMLPaths.CONFIGDIR.get().toAbsolutePath().toString(), "wildplants");

        try {Files.createDirectory(wildplantsConfigurationPath);}
        catch (FileAlreadyExistsException event) { Wildplants.LOGGER.debug("Configuration already exists. nice."); }//do nothing
        catch (IOException event) {Wildplants.LOGGER.error("The wildplants configuration directory could not be created", event);}
    }
}