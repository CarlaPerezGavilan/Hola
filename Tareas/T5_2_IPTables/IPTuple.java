package Tareas.T5_2_IPTables;

public class IPTuple<IP, Permission>{

    public IP ip; 
    public Permission per;

    public IPTuple(IP ip, Permission per){
        this.ip= ip; 
        this.per = per; 
    }

    public void setPermission(Permission per){
        this.per=per;
    }

    public Permission getPermission(){
        return per;
    }

    public IP getIP(){
        return ip;
    }

    public IPTuple getIPTuple(){
        return this;
    }
}