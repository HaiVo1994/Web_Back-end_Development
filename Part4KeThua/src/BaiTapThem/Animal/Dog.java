package BaiTapThem.Animal;

import BaiTapThem.License.ILicensable;
import BaiTapThem.License.License;

public class Dog extends Pet implements ILicensable {
    private License license;
    public Dog(String name, License license) {
        super(name);
        this.license = license;
    }

    @Override
    public License getLicense(){
        return this.license;
    }
    @Override
    public void speak(){
        System.out.println(getName() + " : Gau gau");
    }
}
