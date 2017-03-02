package com.boss.oms.dao.model;

import java.io.Serializable;

public class TempUserBankInfo implements Serializable {
    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 用户选择银行代码
     *
     * @mbg.generated
     */
    private String oldUserBankCode;

    /**
     * 银行名称
     *
     * @mbg.generated
     */
    private String oldUserBankName;

    /**
     * 银行代码
     *
     * @mbg.generated
     */
    private String newUserBankCode;

    /**
     * 银行名称
     *
     * @mbg.generated
     */
    private String newUserBankName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOldUserBankCode() {
        return oldUserBankCode;
    }

    public void setOldUserBankCode(String oldUserBankCode) {
        this.oldUserBankCode = oldUserBankCode;
    }

    public String getOldUserBankName() {
        return oldUserBankName;
    }

    public void setOldUserBankName(String oldUserBankName) {
        this.oldUserBankName = oldUserBankName;
    }

    public String getNewUserBankCode() {
        return newUserBankCode;
    }

    public void setNewUserBankCode(String newUserBankCode) {
        this.newUserBankCode = newUserBankCode;
    }

    public String getNewUserBankName() {
        return newUserBankName;
    }

    public void setNewUserBankName(String newUserBankName) {
        this.newUserBankName = newUserBankName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oldUserBankCode=").append(oldUserBankCode);
        sb.append(", oldUserBankName=").append(oldUserBankName);
        sb.append(", newUserBankCode=").append(newUserBankCode);
        sb.append(", newUserBankName=").append(newUserBankName);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TempUserBankInfo other = (TempUserBankInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOldUserBankCode() == null ? other.getOldUserBankCode() == null : this.getOldUserBankCode().equals(other.getOldUserBankCode()))
            && (this.getOldUserBankName() == null ? other.getOldUserBankName() == null : this.getOldUserBankName().equals(other.getOldUserBankName()))
            && (this.getNewUserBankCode() == null ? other.getNewUserBankCode() == null : this.getNewUserBankCode().equals(other.getNewUserBankCode()))
            && (this.getNewUserBankName() == null ? other.getNewUserBankName() == null : this.getNewUserBankName().equals(other.getNewUserBankName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOldUserBankCode() == null) ? 0 : getOldUserBankCode().hashCode());
        result = prime * result + ((getOldUserBankName() == null) ? 0 : getOldUserBankName().hashCode());
        result = prime * result + ((getNewUserBankCode() == null) ? 0 : getNewUserBankCode().hashCode());
        result = prime * result + ((getNewUserBankName() == null) ? 0 : getNewUserBankName().hashCode());
        return result;
    }
}