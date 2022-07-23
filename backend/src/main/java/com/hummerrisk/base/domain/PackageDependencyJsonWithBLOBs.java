package com.hummerrisk.base.domain;

import java.io.Serializable;

public class PackageDependencyJsonWithBLOBs extends PackageDependencyJson implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json.evidence_collected
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String evidenceCollected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json.projectReferences
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String projectreferences;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json.packages
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String packages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json.vulnerabilities
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private String vulnerabilities;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table package_dependency_json
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json.evidence_collected
     *
     * @return the value of package_dependency_json.evidence_collected
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getEvidenceCollected() {
        return evidenceCollected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json.evidence_collected
     *
     * @param evidenceCollected the value for package_dependency_json.evidence_collected
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setEvidenceCollected(String evidenceCollected) {
        this.evidenceCollected = evidenceCollected == null ? null : evidenceCollected.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json.projectReferences
     *
     * @return the value of package_dependency_json.projectReferences
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getProjectreferences() {
        return projectreferences;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json.projectReferences
     *
     * @param projectreferences the value for package_dependency_json.projectReferences
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setProjectreferences(String projectreferences) {
        this.projectreferences = projectreferences == null ? null : projectreferences.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json.packages
     *
     * @return the value of package_dependency_json.packages
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getPackages() {
        return packages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json.packages
     *
     * @param packages the value for package_dependency_json.packages
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setPackages(String packages) {
        this.packages = packages == null ? null : packages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json.vulnerabilities
     *
     * @return the value of package_dependency_json.vulnerabilities
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public String getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json.vulnerabilities
     *
     * @param vulnerabilities the value for package_dependency_json.vulnerabilities
     *
     * @mbg.generated Sun Jul 24 02:46:37 CST 2022
     */
    public void setVulnerabilities(String vulnerabilities) {
        this.vulnerabilities = vulnerabilities == null ? null : vulnerabilities.trim();
    }
}