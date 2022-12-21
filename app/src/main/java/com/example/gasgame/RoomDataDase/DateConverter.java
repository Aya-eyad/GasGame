package com.example.gasgame.RoomDataDase;

import androidx.room.TypeConverter;

import java.util.Date;

public class DateConverter {
    @TypeConverter // sاما بالاستدعاءب sهين من دونConverter
    //هاى ميثود بتاخد لونج وبترجع دات يعني بتجيب البيانات من الداتا بيز
    //  null هاى اوبجيكت يعني بنفع اكتبلها Long
    public static Date todate (Long milliscond  ){// لانو الميثود ما بتتعرفش ع السمول longلازم  هيك مشLong
/*if (milliscond!=null)
    return new Date(milliscond);
return null;*/
//  كلو بسطرif ممكن اختصر كود ال
       return milliscond==null?null:new Date(milliscond);
    }
    @TypeConverter

    //هاى ميثود بتاخد دات وبترجع لونج يعني بتخزن البيانات فى الداتا بيز
    public static Long fromdate (Date date  ){// لانو الميثود ما بتتعرفش ع السمول longلازم  هيك مشLong
        return date == null ? new Long(date.getTime()) : null;
        /* if (date!=null)
            return new Long(date.getTime());
        return null;*/
    }
}
