package com.boss.oms.dao.model;

import java.io.Serializable;

public class TRolePermission implements Serializable {
    private Long id;

    private Long sysRoleId;

    private Long sysPreId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public Long getSysPreId() {
        return sysPreId;
    }

    public void setSysPreId(Long sysPreId) {
        this.sysPreId = sysPreId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysRoleId=").append(sysRoleId);
        sb.append(", sysPreId=").append(sysPreId);
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
        TRolePermission other = (TRolePermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSysRoleId() == null ? other.getSysRoleId() == null : this.getSysRoleId().equals(other.getSysRoleId()))
            && (this.getSysPreId() == null ? other.getSysPreId() == null : this.getSysPreId().equals(other.getSysPreId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSysRoleId() == null) ? 0 : getSysRoleId().hashCode());
        result = prime * result + ((getSysPreId() == null) ? 0 : getSysPreId().hashCode());
        return result;
    }
}