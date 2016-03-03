/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hd
/*     */   extends ft
/*     */ {
/*     */   private int a;
/*     */   private boolean b;
/*     */   private ahk c;
/*     */   private int d;
/*     */   private rd e;
/*     */   private int f;
/*     */   private ahm g;
/*     */   
/*     */   public hd() {}
/*     */   
/*     */   public hd(int paramInt1, ahk paramahk, boolean paramBoolean, int paramInt2, rd paramrd, int paramInt3, ahm paramahm)
/*     */   {
/*  29 */     this.a = paramInt1;
/*  30 */     this.d = paramInt2;
/*  31 */     this.e = paramrd;
/*  32 */     this.c = paramahk;
/*  33 */     this.f = paramInt3;
/*  34 */     this.b = paramBoolean;
/*  35 */     this.g = paramahm;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  40 */     this.a = paramet.readInt();
/*     */     
/*  42 */     int i = paramet.readUnsignedByte();
/*  43 */     this.b = ((i & 0x8) == 8);
/*  44 */     i &= 0xFFFFFFF7;
/*  45 */     this.c = ahk.a(i);
/*     */     
/*  47 */     this.d = paramet.readByte();
/*  48 */     this.e = rd.a(paramet.readUnsignedByte());
/*  49 */     this.f = paramet.readUnsignedByte();
/*  50 */     this.g = ahm.a(paramet.c(16));
/*  51 */     if (this.g == null) {
/*  52 */       this.g = ahm.b;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  58 */     paramet.writeInt(this.a);
/*  59 */     int i = this.c.a();
/*  60 */     if (this.b) i |= 0x8;
/*  61 */     paramet.writeByte(i);
/*  62 */     paramet.writeByte(this.d);
/*  63 */     paramet.writeByte(this.e.a());
/*  64 */     paramet.writeByte(this.f);
/*  65 */     paramet.a(this.g.a());
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/*  70 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  75 */     return String.format("eid=%d, gameType=%d, hardcore=%b, dimension=%d, difficulty=%s, maxplayers=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.c.a()), Boolean.valueOf(this.b), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f) });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int c()
/*     */   {
/*  86 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  90 */     return this.b;
/*     */   }
/*     */   
/*     */   public ahk e() {
/*  94 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/*  98 */     return this.d;
/*     */   }
/*     */   
/*     */   public rd g() {
/* 102 */     return this.e;
/*     */   }
/*     */   
/*     */   public int h() {
/* 106 */     return this.f;
/*     */   }
/*     */   
/*     */   public ahm i() {
/* 110 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */