import java.util.Date;

public class Data {
    public boolean isDatasIguais(Date datas[]) {
        return datas[0].equals(datas[1]);
    }

    public String ordemDatas(Date datas[]) {
        if(datas[0].before(datas[1])) {
            return String.format("A data " + datas[0] + " é anterior a data " + datas[1]);
        } else {
            return String.format("A data " + datas[1] + " é anterior a data " + datas[0]);
        }
    }

    public long diferencaDias(Date datas[]) {
        long datasInt[] = new long[2];
        for(int i = 0; i < datasInt.length; i++) {
            datasInt[i] = datas[i].getTime();
        }
        return (datasInt[0] - datasInt[1]) / 86400000;
    }
}
