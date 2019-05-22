package lesson19.practice;

import lesson19.FileCopyUtils;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {
    private String src;
    private String dst;
    private FileCopyUtils fileCopyUtils;

    public CopyFileTaskImpl() {
    }

    public CopyFileTaskImpl(String src, String dst) {
        this.src = src;
        this.dst = dst;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.fileCopyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            fileCopyUtils.copyFile(src, dst);
        } catch (Exception e) {
            throw new TaskExecutionFailedException("Something goes wrong");
        }
    }
}
