package net.gcnt.skywarsreloaded.data.config;

import net.gcnt.skywarsreloaded.AbstractSkyWarsReloaded;
import net.gcnt.skywarsreloaded.data.config.YAMLConfig;
import org.jetbrains.annotations.Nullable;

import java.io.*;

public abstract class AbstractYAMLConfig implements YAMLConfig {

    protected final AbstractSkyWarsReloaded plugin;

    private final String id;
    private final File file;
    private final String fileName;
    private final File directory;
    private final String directoryName;

    public AbstractYAMLConfig(AbstractSkyWarsReloaded pluginIn, String idIn, @Nullable String directoryNameIn, String fileNameIn) {
        this.id = idIn;
        this.plugin = pluginIn;
        this.fileName = fileNameIn;
        this.directoryName = directoryNameIn;

        if (directoryName != null) {
            // We are using a file that is not in the main plugin directory
            directory = new File(pluginIn.getDataFolder() + File.separator + directoryName);
        } else {
            // Else, use default plugin dir
            directory = pluginIn.getDataFolder();
        }

        file = new File(directory, fileNameIn);

        if (!directory.exists() || !file.exists()) {
            if (!this.copyDefaultFile()) {
                return;
            }
        }
    }

    public boolean copyDefaultFile() {
        InputStream internalFileStream = getClass().getResourceAsStream("/" + directory + File.separator + fileName);
        if (internalFileStream == null) {
            return false;
        }
        InputStreamReader isr = new InputStreamReader(internalFileStream);
        BufferedReader bufferedReader = new BufferedReader(isr);

        File dataFolder = plugin.getDataFolder();

        try {
            if (!dataFolder.exists()) {
                dataFolder.mkdirs();
            }
        } catch (SecurityException ex) {
            ex.printStackTrace();
            return false;
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line + "\n");
            }

            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDirectoryName() {
        return directoryName;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public File getDirectory() {
        return directory;
    }

    @Override
    public File getFile() {
        return file;
    }


}
