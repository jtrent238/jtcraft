/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bl
/*     */   extends z
/*     */   implements x
/*     */ {
/*     */   public bl()
/*     */   {
/*  15 */     a(new bz());
/*  16 */     a(new ar());
/*  17 */     a(new aq());
/*  18 */     a(new al());
/*  19 */     a(new aw());
/*  20 */     a(new ca());
/*  21 */     a(new cb());
/*  22 */     a(new ap());
/*  23 */     a(new bv());
/*  24 */     a(new at());
/*  25 */     a(new am());
/*  26 */     a(new ao());
/*  27 */     a(new an());
/*  28 */     a(new bq());
/*  29 */     a(new au());
/*  30 */     a(new ak());
/*  31 */     a(new az());
/*  32 */     a(new ah());
/*  33 */     a(new bp());
/*  34 */     a(new bn());
/*  35 */     a(new as());
/*  36 */     a(new ai());
/*  37 */     a(new by());
/*  38 */     a(new br());
/*  39 */     a(new bf());
/*  40 */     a(new bk());
/*  41 */     a(new ae());
/*  42 */     a(new bu());
/*  43 */     a(new bm());
/*  44 */     a(new bx());
/*  45 */     a(new ba());
/*     */     
/*  47 */     if (MinecraftServer.I().X()) {
/*  48 */       a(new bc());
/*  49 */       a(new aj());
/*  50 */       a(new bt());
/*  51 */       a(new bh());
/*  52 */       a(new bi());
/*  53 */       a(new bj());
/*  54 */       a(new af());
/*  55 */       a(new bd());
/*  56 */       a(new ag());
/*  57 */       a(new ax());
/*  58 */       a(new be());
/*  59 */       a(new av());
/*  60 */       a(new ay());
/*  61 */       a(new cc());
/*  62 */       a(new bo());
/*  63 */       a(new bb());
/*     */     } else {
/*  65 */       a(new bg());
/*     */     }
/*     */     
/*     */ 
/*  69 */     y.a(this);
/*     */   }
/*     */   
/*     */   public void a(ac paramac, aa paramaa, int paramInt, String paramString, Object... paramVarArgs)
/*     */   {
/*  74 */     int i = 1;
/*     */     
/*  76 */     if (((paramac instanceof agp)) && 
/*  77 */       (!MinecraftServer.I().c[0].O().b("commandBlockOutput"))) {
/*  78 */       i = 0;
/*     */     }
/*     */     
/*     */ 
/*  82 */     fr localfr = new fr("chat.type.admin", new Object[] { paramac.b_(), new fr(paramString, paramVarArgs) });
/*  83 */     localfr.b().a(a.h);
/*  84 */     localfr.b().b(Boolean.valueOf(true));
/*     */     
/*  86 */     if (i != 0) {
/*  87 */       for (yz localyz : MinecraftServer.I().ah().e) {
/*  88 */         if ((localyz != paramac) && (MinecraftServer.I().ah().g(localyz.bJ())) && (paramaa.a(localyz)) && (
/*  89 */           (!(paramac instanceof ov)) || (MinecraftServer.I().m()))) {
/*  90 */           localyz.a(localfr);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  96 */     if (paramac != MinecraftServer.I()) {
/*  97 */       MinecraftServer.I().a(localfr);
/*     */     }
/*     */     
/* 100 */     if ((paramInt & 0x1) != 1) {
/* 101 */       paramac.a(new fr(paramString, paramVarArgs));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */