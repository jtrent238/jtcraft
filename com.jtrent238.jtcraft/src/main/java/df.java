/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class df
/*    */   extends dy
/*    */ {
/*    */   private byte[] b;
/*    */   
/*    */   df() {}
/*    */   
/*    */   public df(byte[] paramArrayOfByte)
/*    */   {
/* 14 */     this.b = paramArrayOfByte;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 19 */     paramDataOutput.writeInt(this.b.length);
/* 20 */     paramDataOutput.write(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 25 */     int i = paramDataInput.readInt();
/* 26 */     paramds.a(8 * i);
/* 27 */     this.b = new byte[i];
/* 28 */     paramDataInput.readFully(this.b);
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 33 */     return 7;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 38 */     return "[" + this.b.length + " bytes]";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 43 */     byte[] arrayOfByte = new byte[this.b.length];
/* 44 */     System.arraycopy(this.b, 0, arrayOfByte, 0, this.b.length);
/* 45 */     return new df(arrayOfByte);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 50 */     if (super.equals(paramObject)) {
/* 51 */       return Arrays.equals(this.b, ((df)paramObject).b);
/*    */     }
/* 53 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 58 */     return super.hashCode() ^ Arrays.hashCode(this.b);
/*    */   }
/*    */   
/*    */   public byte[] c() {
/* 62 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */