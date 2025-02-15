/*
 * This file is generated by jOOQ.
 */
package cfm.onthi.entities.tables;


import cfm.onthi.entities.Indexes;
import cfm.onthi.entities.Keys;
import cfm.onthi.entities.SOnthi;
import cfm.onthi.entities.tables.records.OtLessonRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OtLesson extends TableImpl<OtLessonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>s_onthi.ot_lesson</code>
     */
    public static final OtLesson OT_LESSON = new OtLesson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtLessonRecord> getRecordType() {
        return OtLessonRecord.class;
    }

    /**
     * The column <code>s_onthi.ot_lesson.ID_LESSON</code>.
     */
    public final TableField<OtLessonRecord, Long> ID_LESSON = createField(DSL.name("ID_LESSON"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.ID_COURSE</code>.
     */
    public final TableField<OtLessonRecord, Long> ID_COURSE = createField(DSL.name("ID_COURSE"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.LESSON_PARENT</code>.
     */
    public final TableField<OtLessonRecord, Long> LESSON_PARENT = createField(DSL.name("LESSON_PARENT"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>s_onthi.ot_lesson.LESSON_NAME</code>.
     */
    public final TableField<OtLessonRecord, String> LESSON_NAME = createField(DSL.name("LESSON_NAME"), SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.LINK_VIDEO</code>.
     */
    public final TableField<OtLessonRecord, String> LINK_VIDEO = createField(DSL.name("LINK_VIDEO"), SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.DURATION</code>.
     */
    public final TableField<OtLessonRecord, Double> DURATION = createField(DSL.name("DURATION"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>s_onthi.ot_lesson.ORDER</code>.
     */
    public final TableField<OtLessonRecord, Long> ORDER = createField(DSL.name("ORDER"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>s_onthi.ot_lesson.CONTINUE_TIME</code>.
     */
    public final TableField<OtLessonRecord, Double> CONTINUE_TIME = createField(DSL.name("CONTINUE_TIME"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>s_onthi.ot_lesson.VIEW</code>.
     */
    public final TableField<OtLessonRecord, Long> VIEW = createField(DSL.name("VIEW"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.DESCRIPTION</code>.
     */
    public final TableField<OtLessonRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.CREATED_DATE</code>.
     */
    public final TableField<OtLessonRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("CREATED_DATE"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.LAST_MODIFIED_BY</code>.
     */
    public final TableField<OtLessonRecord, String> LAST_MODIFIED_BY = createField(DSL.name("LAST_MODIFIED_BY"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>s_onthi.ot_lesson.LAST_MODIFIED_DATE</code>.
     */
    public final TableField<OtLessonRecord, LocalDateTime> LAST_MODIFIED_DATE = createField(DSL.name("LAST_MODIFIED_DATE"), SQLDataType.LOCALDATETIME(6), this, "");

    private OtLesson(Name alias, Table<OtLessonRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtLesson(Name alias, Table<OtLessonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>s_onthi.ot_lesson</code> table reference
     */
    public OtLesson(String alias) {
        this(DSL.name(alias), OT_LESSON);
    }

    /**
     * Create an aliased <code>s_onthi.ot_lesson</code> table reference
     */
    public OtLesson(Name alias) {
        this(alias, OT_LESSON);
    }

    /**
     * Create a <code>s_onthi.ot_lesson</code> table reference
     */
    public OtLesson() {
        this(DSL.name("ot_lesson"), null);
    }

    public <O extends Record> OtLesson(Table<O> child, ForeignKey<O, OtLessonRecord> key) {
        super(child, key, OT_LESSON);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : SOnthi.S_ONTHI;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.OT_LESSON_ID_COURSE);
    }

    @Override
    public Identity<OtLessonRecord, Long> getIdentity() {
        return (Identity<OtLessonRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<OtLessonRecord> getPrimaryKey() {
        return Keys.KEY_OT_LESSON_PRIMARY;
    }

    @Override
    public List<ForeignKey<OtLessonRecord, ?>> getReferences() {
        return Arrays.asList(Keys.OT_LESSON_IBFK_1);
    }

    private transient OtCourse _otCourse;

    /**
     * Get the implicit join path to the <code>s_onthi.ot_course</code> table.
     */
    public OtCourse otCourse() {
        if (_otCourse == null)
            _otCourse = new OtCourse(this, Keys.OT_LESSON_IBFK_1);

        return _otCourse;
    }

    @Override
    public OtLesson as(String alias) {
        return new OtLesson(DSL.name(alias), this);
    }

    @Override
    public OtLesson as(Name alias) {
        return new OtLesson(alias, this);
    }

    @Override
    public OtLesson as(Table<?> alias) {
        return new OtLesson(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtLesson rename(String name) {
        return new OtLesson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtLesson rename(Name name) {
        return new OtLesson(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtLesson rename(Table<?> name) {
        return new OtLesson(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, Long, String, String, Double, Long, Double, Long, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super Double, ? super Long, ? super Double, ? super Long, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super Double, ? super Long, ? super Double, ? super Long, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
