/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class dx extends dy
/*    */ {
/*    */   private String b;
/*    */   
/*    */   public dx()
/*    */   {
/* 10 */     this.b = "";
/*    */   }
/*    */   
/*    */   public dx(String paramString) {
/* 14 */     this.b = paramString;
/* 15 */     if (paramString == null) throw new IllegalArgumentException("Empty string not allowed");
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput)
/*    */   {
/* 20 */     paramDataOutput.writeUTF(this.b);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput, int paramInt, ds paramds)
/*    */   {
/* 25 */     this.b = paramDataInput.readUTF();
/* 26 */     paramds.a(16 * this.b.length());
/*    */   }
/*    */   
/*    */   public byte a()
/*    */   {
/* 31 */     return 8;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 36 */     return "\"" + this.b + "\"";
/*    */   }
/*    */   
/*    */   public dy b()
/*    */   {
/* 41 */     return new dx(this.b);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 46 */     if (super.equals(paramObject)) {
/* 47 */       dx localdx = (dx)paramObject;
/* 48 */       return ((this.b == null) && (localdx.b == null)) || ((this.b != null) && (this.b.equals(localdx.b)));
/*    */     }
/* 50 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 55 */     return super.hashCode() ^ this.b.hashCode();
/*    */   }
/*    */   
/*    */   public String a_()
/*    */   {
/* 60 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */