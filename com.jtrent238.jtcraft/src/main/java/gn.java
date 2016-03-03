/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gn
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private String c;
/*    */   private int d;
/*    */   private boolean e;
/*    */   private int f;
/*    */   
/*    */   public gn() {}
/*    */   
/*    */   public gn(int paramInt1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean)
/*    */   {
/* 37 */     this.a = paramInt1;
/* 38 */     this.b = paramInt2;
/* 39 */     this.c = paramString;
/* 40 */     this.d = paramInt3;
/* 41 */     this.e = paramBoolean;
/*    */   }
/*    */   
/*    */   public gn(int paramInt1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean, int paramInt4) {
/* 45 */     this(paramInt1, paramInt2, paramString, paramInt3, paramBoolean);
/* 46 */     this.f = paramInt4;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 51 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 56 */     this.a = paramet.readUnsignedByte();
/* 57 */     this.b = paramet.readUnsignedByte();
/* 58 */     this.c = paramet.c(32);
/* 59 */     this.d = paramet.readUnsignedByte();
/* 60 */     this.e = paramet.readBoolean();
/* 61 */     if (this.b == 11) {
/* 62 */       this.f = paramet.readInt();
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 68 */     paramet.writeByte(this.a);
/* 69 */     paramet.writeByte(this.b);
/* 70 */     paramet.a(this.c);
/* 71 */     paramet.writeByte(this.d);
/* 72 */     paramet.writeBoolean(this.e);
/* 73 */     if (this.b == 11) {
/* 74 */       paramet.writeInt(this.f);
/*    */     }
/*    */   }
/*    */   
/*    */   public int c() {
/* 79 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 83 */     return this.b;
/*    */   }
/*    */   
/*    */   public String e() {
/* 87 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 91 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 95 */     return this.e;
/*    */   }
/*    */   
/*    */   public int h() {
/* 99 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */