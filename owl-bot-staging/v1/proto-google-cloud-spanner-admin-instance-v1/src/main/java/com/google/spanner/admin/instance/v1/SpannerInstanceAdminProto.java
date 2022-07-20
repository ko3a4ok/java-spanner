// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public final class SpannerInstanceAdminProto {
  private SpannerInstanceAdminProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ReplicaInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ReplicaInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/spanner/admin/instance/v1/spann" +
      "er_instance_admin.proto\022 google.spanner." +
      "admin.instance.v1\032\034google/api/annotation" +
      "s.proto\032\027google/api/client.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\032\036google/iam/v1/iam_policy.p" +
      "roto\032\032google/iam/v1/policy.proto\032#google" +
      "/longrunning/operations.proto\032\033google/pr" +
      "otobuf/empty.proto\032 google/protobuf/fiel" +
      "d_mask.proto\032\037google/protobuf/timestamp." +
      "proto\"\332\001\n\013ReplicaInfo\022\020\n\010location\030\001 \001(\t\022" +
      "G\n\004type\030\002 \001(\01629.google.spanner.admin.ins" +
      "tance.v1.ReplicaInfo.ReplicaType\022\037\n\027defa" +
      "ult_leader_location\030\003 \001(\010\"O\n\013ReplicaType" +
      "\022\024\n\020TYPE_UNSPECIFIED\020\000\022\016\n\nREAD_WRITE\020\001\022\r" +
      "\n\tREAD_ONLY\020\002\022\013\n\007WITNESS\020\003\"\357\001\n\016InstanceC" +
      "onfig\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(" +
      "\t\022?\n\010replicas\030\003 \003(\0132-.google.spanner.adm" +
      "in.instance.v1.ReplicaInfo\022\026\n\016leader_opt" +
      "ions\030\004 \003(\t:`\352A]\n%spanner.googleapis.com/" +
      "InstanceConfig\0224projects/{project}/insta" +
      "nceConfigs/{instance_config}\"\355\004\n\010Instanc" +
      "e\022\021\n\004name\030\001 \001(\tB\003\340A\002\022=\n\006config\030\002 \001(\tB-\340A" +
      "\002\372A\'\n%spanner.googleapis.com/InstanceCon" +
      "fig\022\031\n\014display_name\030\003 \001(\tB\003\340A\002\022\022\n\nnode_c" +
      "ount\030\005 \001(\005\022\030\n\020processing_units\030\t \001(\005\022D\n\005" +
      "state\030\006 \001(\01620.google.spanner.admin.insta" +
      "nce.v1.Instance.StateB\003\340A\003\022F\n\006labels\030\007 \003" +
      "(\01326.google.spanner.admin.instance.v1.In" +
      "stance.LabelsEntry\022\025\n\rendpoint_uris\030\010 \003(" +
      "\t\0224\n\013create_time\030\013 \001(\0132\032.google.protobuf" +
      ".TimestampB\003\340A\003\0224\n\013update_time\030\014 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\003\032-\n\013LabelsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"7\n\005" +
      "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING" +
      "\020\001\022\t\n\005READY\020\002:M\352AJ\n\037spanner.googleapis.c" +
      "om/Instance\022\'projects/{project}/instance" +
      "s/{instance}\"\210\001\n\032ListInstanceConfigsRequ" +
      "est\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudresour" +
      "cemanager.googleapis.com/Project\022\021\n\tpage" +
      "_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\202\001\n\033List" +
      "InstanceConfigsResponse\022J\n\020instance_conf" +
      "igs\030\001 \003(\01320.google.spanner.admin.instanc" +
      "e.v1.InstanceConfig\022\027\n\017next_page_token\030\002" +
      " \001(\t\"W\n\030GetInstanceConfigRequest\022;\n\004name" +
      "\030\001 \001(\tB-\340A\002\372A\'\n%spanner.googleapis.com/I" +
      "nstanceConfig\"{\n\022GetInstanceRequest\0225\n\004n" +
      "ame\030\001 \001(\tB\'\340A\002\372A!\n\037spanner.googleapis.co" +
      "m/Instance\022.\n\nfield_mask\030\002 \001(\0132\032.google." +
      "protobuf.FieldMask\"\271\001\n\025CreateInstanceReq" +
      "uest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudresou" +
      "rcemanager.googleapis.com/Project\022\030\n\013ins" +
      "tance_id\030\002 \001(\tB\003\340A\002\022A\n\010instance\030\003 \001(\0132*." +
      "google.spanner.admin.instance.v1.Instanc" +
      "eB\003\340A\002\"\222\001\n\024ListInstancesRequest\022C\n\006paren" +
      "t\030\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager.go" +
      "ogleapis.com/Project\022\021\n\tpage_size\030\002 \001(\005\022" +
      "\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"o\n\025L" +
      "istInstancesResponse\022=\n\tinstances\030\001 \003(\0132" +
      "*.google.spanner.admin.instance.v1.Insta" +
      "nce\022\027\n\017next_page_token\030\002 \001(\t\"\217\001\n\025UpdateI" +
      "nstanceRequest\022A\n\010instance\030\001 \001(\0132*.googl" +
      "e.spanner.admin.instance.v1.InstanceB\003\340A" +
      "\002\0223\n\nfield_mask\030\002 \001(\0132\032.google.protobuf." +
      "FieldMaskB\003\340A\002\"N\n\025DeleteInstanceRequest\022" +
      "5\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037spanner.googleapi" +
      "s.com/Instance\"\345\001\n\026CreateInstanceMetadat" +
      "a\022<\n\010instance\030\001 \001(\0132*.google.spanner.adm" +
      "in.instance.v1.Instance\022.\n\nstart_time\030\002 " +
      "\001(\0132\032.google.protobuf.Timestamp\022/\n\013cance" +
      "l_time\030\003 \001(\0132\032.google.protobuf.Timestamp" +
      "\022,\n\010end_time\030\004 \001(\0132\032.google.protobuf.Tim" +
      "estamp\"\345\001\n\026UpdateInstanceMetadata\022<\n\010ins" +
      "tance\030\001 \001(\0132*.google.spanner.admin.insta" +
      "nce.v1.Instance\022.\n\nstart_time\030\002 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022/\n\013cancel_time\030\003" +
      " \001(\0132\032.google.protobuf.Timestamp\022,\n\010end_" +
      "time\030\004 \001(\0132\032.google.protobuf.Timestamp2\277" +
      "\020\n\rInstanceAdmin\022\314\001\n\023ListInstanceConfigs" +
      "\022<.google.spanner.admin.instance.v1.List" +
      "InstanceConfigsRequest\032=.google.spanner." +
      "admin.instance.v1.ListInstanceConfigsRes" +
      "ponse\"8\202\323\344\223\002)\022\'/v1/{parent=projects/*}/i" +
      "nstanceConfigs\332A\006parent\022\271\001\n\021GetInstanceC" +
      "onfig\022:.google.spanner.admin.instance.v1" +
      ".GetInstanceConfigRequest\0320.google.spann" +
      "er.admin.instance.v1.InstanceConfig\"6\202\323\344" +
      "\223\002)\022\'/v1/{name=projects/*/instanceConfig" +
      "s/*}\332A\004name\022\264\001\n\rListInstances\0226.google.s" +
      "panner.admin.instance.v1.ListInstancesRe" +
      "quest\0327.google.spanner.admin.instance.v1" +
      ".ListInstancesResponse\"2\202\323\344\223\002#\022!/v1/{par" +
      "ent=projects/*}/instances\332A\006parent\022\241\001\n\013G" +
      "etInstance\0224.google.spanner.admin.instan" +
      "ce.v1.GetInstanceRequest\032*.google.spanne" +
      "r.admin.instance.v1.Instance\"0\202\323\344\223\002#\022!/v" +
      "1/{name=projects/*/instances/*}\332A\004name\022\234" +
      "\002\n\016CreateInstance\0227.google.spanner.admin" +
      ".instance.v1.CreateInstanceRequest\032\035.goo" +
      "gle.longrunning.Operation\"\261\001\202\323\344\223\002&\"!/v1/" +
      "{parent=projects/*}/instances:\001*\332A\033paren" +
      "t,instance_id,instance\312Ad\n)google.spanne" +
      "r.admin.instance.v1.Instance\0227google.spa" +
      "nner.admin.instance.v1.CreateInstanceMet" +
      "adata\022\235\002\n\016UpdateInstance\0227.google.spanne" +
      "r.admin.instance.v1.UpdateInstanceReques" +
      "t\032\035.google.longrunning.Operation\"\262\001\202\323\344\223\002" +
      "/2*/v1/{instance.name=projects/*/instanc" +
      "es/*}:\001*\332A\023instance,field_mask\312Ad\n)googl" +
      "e.spanner.admin.instance.v1.Instance\0227go" +
      "ogle.spanner.admin.instance.v1.UpdateIns" +
      "tanceMetadata\022\223\001\n\016DeleteInstance\0227.googl" +
      "e.spanner.admin.instance.v1.DeleteInstan" +
      "ceRequest\032\026.google.protobuf.Empty\"0\202\323\344\223\002" +
      "#*!/v1/{name=projects/*/instances/*}\332A\004n" +
      "ame\022\232\001\n\014SetIamPolicy\022\".google.iam.v1.Set" +
      "IamPolicyRequest\032\025.google.iam.v1.Policy\"" +
      "O\202\323\344\223\0027\"2/v1/{resource=projects/*/instan" +
      "ces/*}:setIamPolicy:\001*\332A\017resource,policy" +
      "\022\223\001\n\014GetIamPolicy\022\".google.iam.v1.GetIam" +
      "PolicyRequest\032\025.google.iam.v1.Policy\"H\202\323" +
      "\344\223\0027\"2/v1/{resource=projects/*/instances" +
      "/*}:getIamPolicy:\001*\332A\010resource\022\305\001\n\022TestI" +
      "amPermissions\022(.google.iam.v1.TestIamPer" +
      "missionsRequest\032).google.iam.v1.TestIamP" +
      "ermissionsResponse\"Z\202\323\344\223\002=\"8/v1/{resourc" +
      "e=projects/*/instances/*}:testIamPermiss" +
      "ions:\001*\332A\024resource,permissions\032x\312A\026spann" +
      "er.googleapis.com\322A\\https://www.googleap" +
      "is.com/auth/cloud-platform,https://www.g" +
      "oogleapis.com/auth/spanner.adminB\215\002\n$com" +
      ".google.spanner.admin.instance.v1B\031Spann" +
      "erInstanceAdminProtoP\001ZHgoogle.golang.or" +
      "g/genproto/googleapis/spanner/admin/inst" +
      "ance/v1;instance\252\002&Google.Cloud.Spanner." +
      "Admin.Instance.V1\312\002&Google\\Cloud\\Spanner" +
      "\\Admin\\Instance\\V1\352\002+Google::Cloud::Span" +
      "ner::Admin::Instance::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_spanner_admin_instance_v1_ReplicaInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_admin_instance_v1_ReplicaInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ReplicaInfo_descriptor,
        new java.lang.String[] { "Location", "Type", "DefaultLeaderLocation", });
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Replicas", "LeaderOptions", });
    internal_static_google_spanner_admin_instance_v1_Instance_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_admin_instance_v1_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_Instance_descriptor,
        new java.lang.String[] { "Name", "Config", "DisplayName", "NodeCount", "ProcessingUnits", "State", "Labels", "EndpointUris", "CreateTime", "UpdateTime", });
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor =
      internal_static_google_spanner_admin_instance_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor,
        new java.lang.String[] { "InstanceConfigs", "NextPageToken", });
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor,
        new java.lang.String[] { "Name", "FieldMask", });
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor,
        new java.lang.String[] { "Parent", "InstanceId", "Instance", });
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor,
        new java.lang.String[] { "Instances", "NextPageToken", });
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor,
        new java.lang.String[] { "Instance", "FieldMask", });
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor,
        new java.lang.String[] { "Instance", "StartTime", "CancelTime", "EndTime", });
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor,
        new java.lang.String[] { "Instance", "StartTime", "CancelTime", "EndTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
