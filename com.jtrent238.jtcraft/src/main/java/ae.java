/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ae
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  17 */     return "achievement";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  22 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  27 */     return "commands.achievement.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  32 */     if (paramArrayOfString.length >= 2) {
/*  33 */       ph localph = pp.a(paramArrayOfString[1]);
/*     */       
/*     */ 
/*  36 */       if ((localph == null) && (!paramArrayOfString[1].equals("*"))) {
/*  37 */         throw new cd("commands.achievement.unknownAchievement", new Object[] { paramArrayOfString[1] });
/*     */       }
/*     */       mw localmw;
/*  40 */       if (paramArrayOfString.length >= 3) {
/*  41 */         localmw = d(paramac, paramArrayOfString[2]);
/*     */       } else {
/*  43 */         localmw = b(paramac);
/*     */       }
/*     */       
/*  46 */       if (paramArrayOfString[0].equalsIgnoreCase("give")) { Object localObject1;
/*  47 */         Object localObject2; if (localph == null) {
/*  48 */           for (localObject1 = pc.e.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (pb)((Iterator)localObject1).next();
/*  49 */             localmw.a((ph)localObject2);
/*     */           }
/*     */           
/*  52 */           a(paramac, this, "commands.achievement.give.success.all", new Object[] { localmw.b_() });
/*     */         } else {
/*  54 */           if ((localph instanceof pb)) {
/*  55 */             localObject1 = (pb)localph;
/*  56 */             localObject2 = Lists.newArrayList();
/*     */             
/*  58 */             while ((((pb)localObject1).c != null) && (!localmw.w().a(((pb)localObject1).c))) {
/*  59 */               ((List)localObject2).add(((pb)localObject1).c);
/*  60 */               localObject1 = ((pb)localObject1).c;
/*     */             }
/*     */             
/*  63 */             for (pb localpb : Lists.reverse((List)localObject2)) {
/*  64 */               localmw.a(localpb);
/*     */             }
/*     */           }
/*     */           
/*  68 */           localmw.a(localph);
/*     */           
/*  70 */           a(paramac, this, "commands.achievement.give.success.one", new Object[] { localmw.b_(), localph.j() });
/*     */         }
/*     */         
/*  73 */         return;
/*     */       }
/*     */     }
/*     */     
/*  77 */     throw new ci("commands.achievement.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  82 */     if (paramArrayOfString.length == 1) {
/*  83 */       return a(paramArrayOfString, new String[] { "give" });
/*     */     }
/*     */     
/*  86 */     if (paramArrayOfString.length == 2) {
/*  87 */       ArrayList localArrayList = Lists.newArrayList();
/*     */       
/*  89 */       for (ph localph : pp.b) {
/*  90 */         localArrayList.add(localph.e);
/*     */       }
/*     */       
/*  93 */       return a(paramArrayOfString, localArrayList);
/*     */     }
/*     */     
/*  96 */     if (paramArrayOfString.length == 3) {
/*  97 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*     */     }
/*     */     
/* 100 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a(String[] paramArrayOfString, int paramInt)
/*     */   {
/* 105 */     return paramInt == 2;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */