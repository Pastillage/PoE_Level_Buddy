package Data;

import java.io.File;

/**
 *
 */
public abstract class FileChangedWatcher
{
    private File file;

    public FileChangedWatcher(String filePath)
    {
        file = new File(filePath);
    }

    public void watch() throws InterruptedException
    {
        long currentModifiedDate = file.lastModified();

        while (true)
        {
            long newModifiedDate = file.lastModified();

            if (newModifiedDate != currentModifiedDate)
            {
                currentModifiedDate = newModifiedDate;
                onModified();
            }

            Thread.sleep(100);
        }
    }

    public String getFilePath()
    {
        return file.getAbsolutePath();
    }

    protected abstract void onModified();
}
