package com.webank.app.stage.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author liangyongjian
 * @desc 静态配置资源持有器
 * @create 2017-09-29 16:00
 **/
@Configuration
public class WebConfig {

    /**
     * 列表的一页记录数量
     */
    @Value("#{webConfigs['MANAGE_PAGE_SIZE']}")
    private int pageSize;

    /**
     * 查询的时间范围的起始范围
     */
    @Value("#{webConfigs['START_DATE_SEARCH']}")
    private String startDateSearch;

    @Value("#{webConfigs['APP_BASE_PATH']}")
    private String appBasePath;

    @Value("#{webConfigs['EXPORT_PATH']}")
    private String exportPath;

    @Value("#{webConfigs['UPLOAD_PATH']}")
    private String uploadPath;

    @Value("#{webConfigs['IMPORT_PATH']}")
    private String importPath;

    @Value("#{webConfigs['FILE_SUFFIX']}")
    private String fileSuffix;

    @Value("#{webConfigs['IMAGE_SUFFIX']}")
    private String imageSuffix;

    @Value("#{webConfigs['IMAGE_PATH']}")
    private String imagePath;

    @Value("#{webConfigs['SERVER_ADDRESS']}")
    private String serverAddress;

    @Value("#{webConfigs['FILE_SERVER_NAME']}")
    private String fileServerName;

    @Value("#{webConfigs['FRONT_IMG_SUFFIX']}")
    private String frontImgSuffix;

    @Value("#{webConfigs['MAX_FILE_SIZE']}")
    private int maxFileSize;

    public int getPageSize() {
        return pageSize;
    }

    public String getStartDateSearch() {
        return startDateSearch;
    }

    public String getAppBasePath() {
        return appBasePath;
    }

    public String getExportPath() {
        return exportPath;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public String getImportPath() {
        return importPath;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public String getImageSuffix() {
        return imageSuffix;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public String getFileServerName() {
        return fileServerName;
    }

    public String getFrontImgSuffix() {
        return frontImgSuffix;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }
}
