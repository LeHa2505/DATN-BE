/*
 * This file is generated by jOOQ.
 */
package cfm.onthi.entities.tables.records;


import cfm.onthi.entities.tables.OtRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "ot_role",
    schema = "s_onthi"
)
public class OtRoleRecord extends UpdatableRecordImpl<OtRoleRecord> implements Record8<Long, String, String, String, Boolean, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>s_onthi.ot_role.ID_ROLE</code>.
     */
    public void setIdRole(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.ID_ROLE</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLE", nullable = false)
    public Long getIdRole() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>s_onthi.ot_role.ROLE_DESCRIBE</code>.
     */
    public void setRoleDescribe(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.ROLE_DESCRIBE</code>.
     */
    @Column(name = "ROLE_DESCRIBE", length = 255)
    public String getRoleDescribe() {
        return (String) get(1);
    }

    /**
     * Setter for <code>s_onthi.ot_role.ROLE_KEY</code>.
     */
    public void setRoleKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.ROLE_KEY</code>.
     */
    @Column(name = "ROLE_KEY", nullable = false, length = 20)
    public String getRoleKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>s_onthi.ot_role.ROLE_NAME</code>.
     */
    public void setRoleName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.ROLE_NAME</code>.
     */
    @Column(name = "ROLE_NAME", nullable = false, length = 50)
    public String getRoleName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>s_onthi.ot_role.ACTIVE</code>.
     */
    public void setActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.ACTIVE</code>.
     */
    @Column(name = "ACTIVE", nullable = false)
    public Boolean getActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>s_onthi.ot_role.CREATED_DATE</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.CREATED_DATE</code>.
     */
    @Column(name = "CREATED_DATE", precision = 6)
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>s_onthi.ot_role.LAST_MODIFIED_BY</code>.
     */
    public void setLastModifiedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.LAST_MODIFIED_BY</code>.
     */
    @Column(name = "LAST_MODIFIED_BY", length = 50)
    public String getLastModifiedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>s_onthi.ot_role.LAST_MODIFIED_DATE</code>.
     */
    public void setLastModifiedDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>s_onthi.ot_role.LAST_MODIFIED_DATE</code>.
     */
    @Column(name = "LAST_MODIFIED_DATE", precision = 6)
    public LocalDateTime getLastModifiedDate() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, Boolean, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, String, String, Boolean, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return OtRole.OT_ROLE.ID_ROLE;
    }

    @Override
    public Field<String> field2() {
        return OtRole.OT_ROLE.ROLE_DESCRIBE;
    }

    @Override
    public Field<String> field3() {
        return OtRole.OT_ROLE.ROLE_KEY;
    }

    @Override
    public Field<String> field4() {
        return OtRole.OT_ROLE.ROLE_NAME;
    }

    @Override
    public Field<Boolean> field5() {
        return OtRole.OT_ROLE.ACTIVE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return OtRole.OT_ROLE.CREATED_DATE;
    }

    @Override
    public Field<String> field7() {
        return OtRole.OT_ROLE.LAST_MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return OtRole.OT_ROLE.LAST_MODIFIED_DATE;
    }

    @Override
    public Long component1() {
        return getIdRole();
    }

    @Override
    public String component2() {
        return getRoleDescribe();
    }

    @Override
    public String component3() {
        return getRoleKey();
    }

    @Override
    public String component4() {
        return getRoleName();
    }

    @Override
    public Boolean component5() {
        return getActive();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedDate();
    }

    @Override
    public String component7() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime component8() {
        return getLastModifiedDate();
    }

    @Override
    public Long value1() {
        return getIdRole();
    }

    @Override
    public String value2() {
        return getRoleDescribe();
    }

    @Override
    public String value3() {
        return getRoleKey();
    }

    @Override
    public String value4() {
        return getRoleName();
    }

    @Override
    public Boolean value5() {
        return getActive();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedDate();
    }

    @Override
    public String value7() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime value8() {
        return getLastModifiedDate();
    }

    @Override
    public OtRoleRecord value1(Long value) {
        setIdRole(value);
        return this;
    }

    @Override
    public OtRoleRecord value2(String value) {
        setRoleDescribe(value);
        return this;
    }

    @Override
    public OtRoleRecord value3(String value) {
        setRoleKey(value);
        return this;
    }

    @Override
    public OtRoleRecord value4(String value) {
        setRoleName(value);
        return this;
    }

    @Override
    public OtRoleRecord value5(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public OtRoleRecord value6(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public OtRoleRecord value7(String value) {
        setLastModifiedBy(value);
        return this;
    }

    @Override
    public OtRoleRecord value8(LocalDateTime value) {
        setLastModifiedDate(value);
        return this;
    }

    @Override
    public OtRoleRecord values(Long value1, String value2, String value3, String value4, Boolean value5, LocalDateTime value6, String value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OtRoleRecord
     */
    public OtRoleRecord() {
        super(OtRole.OT_ROLE);
    }

    /**
     * Create a detached, initialised OtRoleRecord
     */
    public OtRoleRecord(Long idRole, String roleDescribe, String roleKey, String roleName, Boolean active, LocalDateTime createdDate, String lastModifiedBy, LocalDateTime lastModifiedDate) {
        super(OtRole.OT_ROLE);

        setIdRole(idRole);
        setRoleDescribe(roleDescribe);
        setRoleKey(roleKey);
        setRoleName(roleName);
        setActive(active);
        setCreatedDate(createdDate);
        setLastModifiedBy(lastModifiedBy);
        setLastModifiedDate(lastModifiedDate);
    }

    /**
     * Create a detached, initialised OtRoleRecord
     */
    public OtRoleRecord(cfm.onthi.entities.tables.pojos.OtRole value) {
        super(OtRole.OT_ROLE);

        if (value != null) {
            setIdRole(value.getIdRole());
            setRoleDescribe(value.getRoleDescribe());
            setRoleKey(value.getRoleKey());
            setRoleName(value.getRoleName());
            setActive(value.getActive());
            setCreatedDate(value.getCreatedDate());
            setLastModifiedBy(value.getLastModifiedBy());
            setLastModifiedDate(value.getLastModifiedDate());
        }
    }
}
