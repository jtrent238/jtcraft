/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class dn
/*    */   extends dy
/*    */ {
/*    */   private int[] b;
/*    */   
/*    */   dn() {}
/*    */   
/*    */   public dn(int[] paramArrayOfInt)
/*    */   {
/* 14 */     this.b = paramArrayOfInt;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 19 */     paramDataOutput.writeInt(this.b.length);
/* 20 */     for (int i = 0; i < this.b.length; i++) {
/* 21 */       paramDataOutput.writeInt(this.b[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 27 */     int i = paramDataInput.readInt();
/* 28 */     paramds.a(32 * i);
/* 29 */     this.b = new int[i];
/* 30 */     for (int j = 0; j < i; j++) {
/* 31 */       this.b[j] = paramDataInput.readInt();
/*    */     }
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 37 */     return 11;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 42 */     String str = "[";
/* 43 */     for (int k : this.b) {
/* 44 */       str = str + k + ",";
/*    */     }
/* 46 */     return str + "]";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 51 */     int[] arrayOfInt = new int[this.b.length];
/* 52 */     System.arraycopy(this.b, 0, arrayOfInt, 0, this.b.length);
/* 53 */     return new dn(arrayOfInt);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 58 */     if (super.equals(paramObject)) {
/* 59 */       return Arrays.equals(this.b, ((dn)paramObject).b);
/*    */     }
/* 61 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 66 */     return super.hashCode() ^ Arrays.hashCode(this.b);
/*    */   }
/*    */   
/*    */   public int[] c() {
/* 70 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */