package com.hummerrisk.base.domain;

import java.io.Serializable;

public class ImageSyftJsonWithBLOBs extends ImageSyftJson implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_syft_json.metadata
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String metadata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_syft_json.locations
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String locations;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_syft_json.licenses
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String licenses;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_syft_json.cpes
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String cpes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table image_syft_json
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_syft_json.metadata
     *
     * @return the value of image_syft_json.metadata
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_syft_json.metadata
     *
     * @param metadata the value for image_syft_json.metadata
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata == null ? null : metadata.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_syft_json.locations
     *
     * @return the value of image_syft_json.locations
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getLocations() {
        return locations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_syft_json.locations
     *
     * @param locations the value for image_syft_json.locations
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setLocations(String locations) {
        this.locations = locations == null ? null : locations.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_syft_json.licenses
     *
     * @return the value of image_syft_json.licenses
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getLicenses() {
        return licenses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_syft_json.licenses
     *
     * @param licenses the value for image_syft_json.licenses
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setLicenses(String licenses) {
        this.licenses = licenses == null ? null : licenses.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_syft_json.cpes
     *
     * @return the value of image_syft_json.cpes
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getCpes() {
        return cpes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_syft_json.cpes
     *
     * @param cpes the value for image_syft_json.cpes
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setCpes(String cpes) {
        this.cpes = cpes == null ? null : cpes.trim();
    }
}