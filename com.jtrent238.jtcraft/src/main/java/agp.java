/*     */ import io.netty.buffer.ByteBuf;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public abstract class agp
/*     */   implements ac
/*     */ {
/*  19 */   private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
/*     */   
/*     */ 
/*     */   private int b;
/*     */   
/*     */ 
/*  25 */   private boolean c = true;
/*  26 */   private fj d = null;
/*  27 */   private String e = "";
/*  28 */   private String f = "@";
/*     */   
/*     */   public int g() {
/*  31 */     return this.b;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public fj h()
/*     */   {
/*  39 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/*  43 */     paramdh.a("Command", this.e);
/*  44 */     paramdh.a("SuccessCount", this.b);
/*  45 */     paramdh.a("CustomName", this.f);
/*  46 */     if (this.d != null) paramdh.a("LastOutput", fk.a(this.d));
/*  47 */     paramdh.a("TrackOutput", this.c);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh) {
/*  51 */     this.e = paramdh.j("Command");
/*  52 */     this.b = paramdh.f("SuccessCount");
/*  53 */     if (paramdh.b("CustomName", 8)) this.f = paramdh.j("CustomName");
/*  54 */     if (paramdh.b("LastOutput", 8)) this.d = fk.a(paramdh.j("LastOutput"));
/*  55 */     if (paramdh.b("TrackOutput", 1)) this.c = paramdh.n("TrackOutput");
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, String paramString)
/*     */   {
/*  60 */     return paramInt <= 2;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  64 */     this.e = paramString;
/*     */   }
/*     */   
/*     */   public String i() {
/*  68 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb) {
/*  72 */     if (paramahb.E) {
/*  73 */       this.b = 0;
/*     */     }
/*     */     
/*  76 */     MinecraftServer localMinecraftServer = MinecraftServer.I();
/*  77 */     if ((localMinecraftServer != null) && (localMinecraftServer.ad())) {
/*  78 */       ab localab = localMinecraftServer.J();
/*  79 */       this.b = localab.a(this, this.e);
/*     */     } else {
/*  81 */       this.b = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public String b_()
/*     */   {
/*  87 */     return this.f;
/*     */   }
/*     */   
/*     */   public fj c_()
/*     */   {
/*  92 */     return new fq(b_());
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  96 */     this.f = paramString;
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/* 101 */     if ((this.c) && (d() != null) && (!d().E)) {
/* 102 */       this.d = new fq("[" + a.format(new Date()) + "] ").a(paramfj);
/* 103 */       e();
/*     */     }
/*     */   }
/*     */   
/*     */   public abstract void e();
/*     */   
/*     */   public abstract int f();
/*     */   
/*     */   public abstract void a(ByteBuf paramByteBuf);
/*     */   
/*     */   public void b(fj paramfj) {
/* 114 */     this.d = paramfj;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */