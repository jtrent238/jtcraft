/*    */ import com.google.common.collect.BiMap;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ft
/*    */ {
/* 13 */   private static final Logger a = ;
/*    */   
/*    */   public static ft a(BiMap paramBiMap, int paramInt) {
/*    */     try {
/* 17 */       Class localClass = (Class)paramBiMap.get(Integer.valueOf(paramInt));
/* 18 */       if (localClass == null) return null;
/* 19 */       return (ft)localClass.newInstance();
/*    */     } catch (Exception localException) {
/* 21 */       a.error("Couldn't create packet " + paramInt, localException); }
/* 22 */     return null;
/*    */   }
/*    */   
/*    */   public static void a(ByteBuf paramByteBuf, byte[] paramArrayOfByte)
/*    */   {
/* 27 */     paramByteBuf.writeShort(paramArrayOfByte.length);
/* 28 */     paramByteBuf.writeBytes(paramArrayOfByte);
/*    */   }
/*    */   
/*    */   public static byte[] a(ByteBuf paramByteBuf) {
/* 32 */     int i = paramByteBuf.readShort();
/* 33 */     if (i < 0) throw new IOException("Key was smaller than nothing!  Weird key!");
/* 34 */     byte[] arrayOfByte = new byte[i];
/* 35 */     paramByteBuf.readBytes(arrayOfByte);
/*    */     
/* 37 */     return arrayOfByte;
/*    */   }
/*    */   
/*    */   public abstract void a(et paramet);
/*    */   
/*    */   public abstract void b(et paramet);
/*    */   
/*    */   public abstract void a(fb paramfb);
/*    */   
/*    */   public boolean a() {
/* 47 */     return false;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 52 */     return getClass().getSimpleName();
/*    */   }
/*    */   
/*    */   public String b() {
/* 56 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */