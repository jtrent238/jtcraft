/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.properties.Property;
/*    */ import com.mojang.authlib.properties.PropertyMap;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class dv
/*    */ {
/*    */   public static GameProfile a(dh paramdh)
/*    */   {
/* 16 */     String str1 = null;
/* 17 */     String str2 = null;
/*    */     
/* 19 */     if (paramdh.b("Name", 8)) {
/* 20 */       str1 = paramdh.j("Name");
/*    */     }
/* 22 */     if (paramdh.b("Id", 8)) {
/* 23 */       str2 = paramdh.j("Id");
/*    */     }
/*    */     
/* 26 */     if ((!qn.b(str1)) || (!qn.b(str2))) {
/*    */       UUID localUUID;
/*    */       try {
/* 29 */         localUUID = UUID.fromString(str2);
/*    */       } catch (Throwable localThrowable) {
/* 31 */         localUUID = null;
/*    */       }
/* 33 */       GameProfile localGameProfile = new GameProfile(localUUID, str1);
/*    */       dh localdh1;
/* 35 */       if (paramdh.b("Properties", 10)) {
/* 36 */         localdh1 = paramdh.m("Properties");
/*    */         
/* 38 */         for (String str3 : localdh1.c()) {
/* 39 */           dq localdq = localdh1.c(str3, 10);
/* 40 */           for (int i = 0; i < localdq.c(); i++) {
/* 41 */             dh localdh2 = localdq.b(i);
/* 42 */             String str4 = localdh2.j("Value");
/*    */             
/* 44 */             if (localdh2.b("Signature", 8)) {
/* 45 */               localGameProfile.getProperties().put(str3, new Property(str3, str4, localdh2.j("Signature")));
/*    */             } else {
/* 47 */               localGameProfile.getProperties().put(str3, new Property(str3, str4));
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */       
/* 53 */       return localGameProfile;
/*    */     }
/* 55 */     return null;
/*    */   }
/*    */   
/*    */   public static void a(dh paramdh, GameProfile paramGameProfile)
/*    */   {
/* 60 */     if (!qn.b(paramGameProfile.getName())) {
/* 61 */       paramdh.a("Name", paramGameProfile.getName());
/*    */     }
/* 63 */     if (paramGameProfile.getId() != null) {
/* 64 */       paramdh.a("Id", paramGameProfile.getId().toString());
/*    */     }
/* 66 */     if (!paramGameProfile.getProperties().isEmpty()) {
/* 67 */       dh localdh1 = new dh();
/* 68 */       for (String str : paramGameProfile.getProperties().keySet()) {
/* 69 */         dq localdq = new dq();
/* 70 */         for (Property localProperty : paramGameProfile.getProperties().get(str)) {
/* 71 */           dh localdh2 = new dh();
/* 72 */           localdh2.a("Value", localProperty.getValue());
/* 73 */           if (localProperty.hasSignature()) {
/* 74 */             localdh2.a("Signature", localProperty.getSignature());
/*    */           }
/* 76 */           localdq.a(localdh2);
/*    */         }
/* 78 */         localdh1.a(str, localdq);
/*    */       }
/* 80 */       paramdh.a("Properties", localdh1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */