package com.hummer.common.core.dto;



import com.hummer.common.core.domain.CloudNativeResultItem;
import com.hummer.common.core.domain.HistoryCloudNativeResult;

import java.util.List;

/**
 * @author harris
 */
public class HistoryK8sReportDTO extends HistoryCloudNativeResult {

    private List<CloudNativeResultItem> k8sResultItems;//结果json

    public List<CloudNativeResultItem> getK8sResultItems() {
        return k8sResultItems;
    }

    public void setK8sResultItems(List<CloudNativeResultItem> k8sResultItems) {
        this.k8sResultItems = k8sResultItems;
    }
}
