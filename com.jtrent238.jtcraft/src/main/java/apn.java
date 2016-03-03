/*     */ import com.google.common.collect.Iterables;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import com.mojang.authlib.properties.PropertyMap;
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
/*     */ 
/*     */ public class apn
/*     */   extends aor
/*     */ {
/*     */   private int a;
/*     */   private int i;
/*  24 */   private GameProfile j = null;
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  28 */     super.b(paramdh);
/*  29 */     paramdh.a("SkullType", (byte)(this.a & 0xFF));
/*  30 */     paramdh.a("Rot", (byte)(this.i & 0xFF));
/*     */     
/*  32 */     if (this.j != null) {
/*  33 */       dh localdh = new dh();
/*  34 */       dv.a(localdh, this.j);
/*  35 */       paramdh.a("Owner", localdh);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  41 */     super.a(paramdh);
/*  42 */     this.a = paramdh.d("SkullType");
/*  43 */     this.i = paramdh.d("Rot");
/*     */     
/*  45 */     if (this.a == 3) {
/*  46 */       if (paramdh.b("Owner", 10)) {
/*  47 */         this.j = dv.a(paramdh.m("Owner"));
/*  48 */       } else if ((paramdh.b("ExtraType", 8)) && (!qn.b(paramdh.j("ExtraType")))) {
/*  49 */         this.j = new GameProfile(null, paramdh.j("ExtraType"));
/*  50 */         d();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public GameProfile a()
/*     */   {
/*  57 */     return this.j;
/*     */   }
/*     */   
/*     */   public ft m()
/*     */   {
/*  62 */     dh localdh = new dh();
/*  63 */     b(localdh);
/*  64 */     return new gf(this.c, this.d, this.e, 4, localdh);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  68 */     this.a = paramInt;
/*  69 */     this.j = null;
/*     */   }
/*     */   
/*     */   public void a(GameProfile paramGameProfile) {
/*  73 */     this.a = 3;
/*  74 */     this.j = paramGameProfile;
/*  75 */     d();
/*     */   }
/*     */   
/*     */   private void d() {
/*  79 */     if ((this.j == null) || (qn.b(this.j.getName())))
/*  80 */       return;
/*  81 */     if ((this.j.isComplete()) && (this.j.getProperties().containsKey("textures"))) {
/*  82 */       return;
/*     */     }
/*     */     
/*     */ 
/*  86 */     GameProfile localGameProfile = MinecraftServer.I().ax().a(this.j.getName());
/*  87 */     if (localGameProfile == null) {
/*  88 */       return;
/*     */     }
/*     */     
/*     */ 
/*  92 */     Property localProperty = (Property)Iterables.getFirst(localGameProfile.getProperties().get("textures"), null);
/*  93 */     if (localProperty == null) {
/*  94 */       localGameProfile = MinecraftServer.I().av().fillProfileProperties(localGameProfile, true);
/*     */     }
/*     */     
/*  97 */     this.j = localGameProfile;
/*  98 */     e();
/*     */   }
/*     */   
/*     */   public int b() {
/* 102 */     return this.a;
/*     */   }
/*     */   
/*     */   public int c() {
/* 106 */     return this.i;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 110 */     this.i = paramInt;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */