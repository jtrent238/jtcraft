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
/*    */ public class iu
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private int b;
/*    */   private zb c;
/*    */   private boolean d;
/*    */   private rd e;
/*    */   private boolean f;
/*    */   
/*    */   public iu() {}
/*    */   
/*    */   public iu(String paramString, int paramInt, zb paramzb, boolean paramBoolean1, rd paramrd, boolean paramBoolean2)
/*    */   {
/* 25 */     this.a = paramString;
/* 26 */     this.b = paramInt;
/* 27 */     this.c = paramzb;
/* 28 */     this.d = paramBoolean1;
/* 29 */     this.e = paramrd;
/* 30 */     this.f = paramBoolean2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 35 */     this.a = paramet.c(7);
/* 36 */     this.b = paramet.readByte();
/*    */     
/* 38 */     this.c = zb.a(paramet.readByte());
/* 39 */     this.d = paramet.readBoolean();
/*    */     
/* 41 */     this.e = rd.a(paramet.readByte());
/* 42 */     this.f = paramet.readBoolean();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 47 */     paramet.a(this.a);
/* 48 */     paramet.writeByte(this.b);
/* 49 */     paramet.writeByte(this.c.a());
/* 50 */     paramet.writeBoolean(this.d);
/* 51 */     paramet.writeByte(this.e.a());
/* 52 */     paramet.writeBoolean(this.f);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 57 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 61 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 65 */     return this.b;
/*    */   }
/*    */   
/*    */   public zb e() {
/* 69 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 73 */     return this.d;
/*    */   }
/*    */   
/*    */   public rd g() {
/* 77 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 81 */     return this.f;
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 86 */     return String.format("lang='%s', view=%d, chat=%s, col=%b, difficulty=%s, cape=%b", new Object[] { this.a, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f) });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\iu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */