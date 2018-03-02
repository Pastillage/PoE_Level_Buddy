package Data;

/**
 *
 */
public class ClientWatcher extends FileChangedWatcher
{
    private boolean fileHasChanged = false;

    public ClientWatcher(String filePath)
    {
        super(filePath);
    }

    @Override
    protected void onModified()
    {
        fileHasChanged = true;
    }

    public void setFileHasChanged(boolean fileHasChanged)
    {
        this.fileHasChanged = fileHasChanged;
    }

    public boolean isFileHasChanged()
    {
        return fileHasChanged;
    }
}
