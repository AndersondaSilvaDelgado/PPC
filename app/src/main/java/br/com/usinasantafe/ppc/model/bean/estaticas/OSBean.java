package br.com.usinasantafe.ppc.model.bean.estaticas;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import br.com.usinasantafe.ppc.model.pst.Entidade;

/**
 * Created by anderson on 12/04/2017.
 */
@DatabaseTable(tableName="tbosest")
public class OSBean extends Entidade {

    private static final long serialVersionUID = 1L;

    @DatabaseField(id=true)
    private Long nroOS;
    @DatabaseField
    private Long idSecao;
    @DatabaseField
    private Long codSecao;

    public OSBean() {
    }

    public Long getNroOS() {
        return nroOS;
    }

    public void setNroOS(Long nroOS) {
        this.nroOS = nroOS;
    }

    public Long getIdSecao() {
        return idSecao;
    }

    public void setIdSecao(Long idSecao) {
        this.idSecao = idSecao;
    }

    public Long getCodSecao() {
        return codSecao;
    }

    public void setCodSecao(Long codSecao) {
        this.codSecao = codSecao;
    }
}
